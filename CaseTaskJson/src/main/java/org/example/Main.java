package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.jsonData.Content;
import org.example.jsonData.Root;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.cert.X509Certificate;

public class Main {
    public static void main(String[] args) throws IOException {
        disableSSLValidation(); //отключить проверку сертификата сайта

        String lastUpdateFrom = "04.12.2019";
        String lastUpdateTo = "10.12.2019";
        String link = "https://bus.gov.ru/public-rest/api/epbs/fap?lastUpdateFrom=" + lastUpdateFrom + "&lastUpdateTo=" + lastUpdateTo + "&page=0&size=100";

        JsonFile jsonFile = new JsonFile("jsonInputData.json");
        jsonFile.loadDataFromURL(link); //скачать данные из url в файл

        ObjectMapper objectMapper = new ObjectMapper();
        Root root = objectMapper.readValue(jsonFile.getFile(), Root.class); //Root - корневой класс базы

        Database database = new Database();
        database.connect();
        database.createTable();
        database.sort(); //отсортировать по значению lastUpdate

        for (Content content : root.getContent()) { //Content - класс, описывающий каждый объект в базе
            //Common - класс, описывающий базовые свойства объекта в базе. Поля класса Common - столбцы результирующей БД.
            database.insertData(lastUpdateFrom, lastUpdateTo, content.getCommon());
        }

        database.closeConnection();
    }

    public static void disableSSLValidation() {
        try {
            final SSLContext sslContext = SSLContext.getInstance("TLS");

            sslContext.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, null);

            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}