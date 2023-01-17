package org.example;

import org.example.jsonData.Common;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection connection = null;

    public void connect() {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "db1351";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Создание таблицы со столбцами, соответствующими полям класса Common.
    // Первичный ключ отсутствует, так как входные параметры повторяются.
    public void createTable() {
        Statement statement = null;
        try {
            dropTable();
            statement = connection.createStatement();
            String query = "create table if not exists json(lastUpdateFrom varchar, lastUpdateTo varchar, " +
                    "financialYear varchar, firstYearPeriod varchar, secondYearPeriod varchar, " +
                    "dateApprovel varchar, date varchar, lastUpdate varchar, " +
                    "founder varchar, founderAgencyId varchar, founderGlavaCode varchar, " +
                    "fullClientName varchar, clientRegionName varchar, clientRegionCode varchar, isArchive bool, " +
                    "summaryRegistryCode varchar, inn varchar, kpp varchar, okeiSymbol varchar, okeiCode varchar)";
            statement.executeUpdate(query);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    // Вставка значений полей класса Common для одного объекта
    public void insertData(String lastUpdateFrom, String lastUpdateTo, @NotNull Common common) {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "insert into json(lastUpdateFrom, lastUpdateTo, financialYear, firstYearPeriod, secondYearPeriod, " +
                            "dateApprovel, date, lastUpdate, founder, founderAgencyId, founderGlavaCode, " +
                            "fullClientName, clientRegionName, clientRegionCode, isArchive, " +
                            "summaryRegistryCode, inn, kpp, okeiSymbol, okeiCode) " +
                            "values ('" + lastUpdateFrom + "', '" + lastUpdateTo + "', '" + common.getFinancialYear() + "', '" +
                    common.getFirstYearPeriod() + "', '" + common.getSecondYearPeriod() + "', '" + common.getDateApprovel() + "', '" +
                    common.getDate() + "', '" + common.getLastUpdate() + "', '" + common.getFounder() + "', '" + common.getFounderAgencyId() + "', '" +
                    common.getFounderGlavaCode() + "', '" + common.getFullClientName() + "', '" + common.getClientRegionName() + "', '" +
                    common.getClientRegionCode() + "', '" + common.isArchive() + "', '" + common.getSummaryRegistryCode() + "', '" +
                    common.getInn() + "', '" + common.getKpp() + "', '" + common.getOkeiSymbol() + "', '" + common.getOkeiCode() + "')";
            statement.executeUpdate(query);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void sort(){
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = "select * from json order by lastupdate";
            statement.executeQuery(query);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void dropTable() {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = "drop table if exists json";
            statement.executeUpdate(query);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
