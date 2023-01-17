package org.example.jsonData;

public class Common {
    public String financialYear;
    public String firstYearPeriod;
    public String secondYearPeriod;
    public Object dateApprovel;
    public Object date;
    public String lastUpdate;
    public Object founder;
    public Object founderAgencyId;
    public Object founderGlavaCode;
    public String fullClientName;
    public String clientRegionName;
    public String clientRegionCode;
    public boolean isArchive;
    public String summaryRegistryCode;
    public String inn;
    public String kpp;
    public String okeiSymbol;
    public String okeiCode;

    public String getFinancialYear() {
        return financialYear;
    }

    public String getFirstYearPeriod() {
        return firstYearPeriod;
    }

    public String getSecondYearPeriod() {
        return secondYearPeriod;
    }

    public Object getDateApprovel() {
        return dateApprovel;
    }

    public Object getDate() {
        return date;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public Object getFounder() {
        return founder;
    }

    public Object getFounderAgencyId() {
        return founderAgencyId;
    }

    public Object getFounderGlavaCode() {
        return founderGlavaCode;
    }

    public String getFullClientName() {
        return fullClientName;
    }

    public String getClientRegionName() {
        return clientRegionName;
    }

    public String getClientRegionCode() {
        return clientRegionCode;
    }

    public boolean isArchive() {
        return isArchive;
    }

    public String getSummaryRegistryCode() {
        return summaryRegistryCode;
    }

    public String getInn() {
        return inn;
    }

    public String getKpp() {
        return kpp;
    }

    public String getOkeiSymbol() {
        return okeiSymbol;
    }

    public String getOkeiCode() {
        return okeiCode;
    }

    @Override
    public String toString() {
        return "Common{" +
                "\nfinancialYear='" + getFinancialYear() + '\'' +
                ", \nfirstYearPeriod='" + getFirstYearPeriod() + '\'' +
                ", \nsecondYearPeriod='" + getSecondYearPeriod() + '\'' +
                ", \ndateApprovel=" + getDateApprovel() +
                ", \ndate=" + getDate() +
                ", \nlastUpdate='" + getLastUpdate() + '\'' +
                ", \nfounder=" + getFounder() +
                ", \nfounderAgencyId=" + getFounderAgencyId() +
                ", \nfounderGlavaCode=" + getFounderGlavaCode() +
                ", \nfullClientName='" + getFullClientName() + '\'' +
                ", \nclientRegionName='" + getClientRegionName() + '\'' +
                ", \nclientRegionCode='" + getClientRegionCode() + '\'' +
                ", \nisArchive=" + isArchive() +
                ", \nsummaryRegistryCode='" + getSummaryRegistryCode() + '\'' +
                ", \ninn='" + getInn() + '\'' +
                ", \nkpp='" + getKpp() + '\'' +
                ", \nokeiSymbol='" + getOkeiSymbol() + '\'' +
                ", \nokeiCode='" + getOkeiCode() + '\'' +
                '}';
    }
}
