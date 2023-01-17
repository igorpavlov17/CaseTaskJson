package org.example.jsonData;

import java.util.ArrayList;

public class Content {
    private Common common;
    private IndicatorsOfFinancialCondition indicatorsOfFinancialCondition;
    private ArrayList<PlanPaymentIndex> planPaymentIndexes;
    private ArrayList<Object> planPaymentIndex2020;
    private ArrayList<PlanPaymentIndexesMain> planPaymentIndexesMain;
    private ArrayList<ExpensePaymentIndex> expensePaymentIndexes;
    private ArrayList<Object> planPaymentTRU;
    private ArrayList<TemporaryResourcesList> temporaryResourcesList;
    private ArrayList<ReferenceList> referenceList;
    private ArrayList<Attachment> attachments;

    public Common getCommon() {
        return common;
    }

    public IndicatorsOfFinancialCondition getIndicatorsOfFinancialCondition() {
        return indicatorsOfFinancialCondition;
    }

    public ArrayList<PlanPaymentIndex> getPlanPaymentIndexes() {
        return planPaymentIndexes;
    }

    public ArrayList<Object> getPlanPaymentIndex2020() {
        return planPaymentIndex2020;
    }

    public ArrayList<PlanPaymentIndexesMain> getPlanPaymentIndexesMain() {
        return planPaymentIndexesMain;
    }

    public ArrayList<ExpensePaymentIndex> getExpensePaymentIndexes() {
        return expensePaymentIndexes;
    }

    public ArrayList<Object> getPlanPaymentTRU() {
        return planPaymentTRU;
    }

    public ArrayList<TemporaryResourcesList> getTemporaryResourcesList() {
        return temporaryResourcesList;
    }

    public ArrayList<ReferenceList> getReferenceList() {
        return referenceList;
    }

    public ArrayList<Attachment> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Content{" +
                "\ncommon=" + getCommon() +
                ", \nindicatorsOfFinancialCondition=" + getIndicatorsOfFinancialCondition() +
                ", \nplanPaymentIndexes=" + getPlanPaymentIndexes() +
                ", \nplanPaymentIndex2020=" + getPlanPaymentIndex2020() +
                ", \nplanPaymentIndexesMain=" + getPlanPaymentIndexesMain() +
                ", \nexpensePaymentIndexes=" + getExpensePaymentIndexes() +
                ", \nplanPaymentTRU=" + getPlanPaymentTRU() +
                ", \ntemporaryResourcesList=" + getTemporaryResourcesList() +
                ", \nreferenceList=" + getReferenceList() +
                ", \nattachments=" + getAttachments() +
                '}';
    }
}
