package org.example;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;

public class JsonFile {
    private final File file;

    public JsonFile(String fileName) {
        this.file = new File(fileName);
    }

    public void loadDataFromURL(String link){
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {
            URL url = new URL(link);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            printWriter = new PrintWriter(file);
            printWriter.println(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public File getFile() {
        return file;
    }
}
