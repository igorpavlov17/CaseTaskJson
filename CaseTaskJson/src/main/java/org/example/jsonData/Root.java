package org.example.jsonData;

import java.util.ArrayList;

public class Root{
    private ArrayList<Content> content;
    private int totalElements;
    private int totalElementsInteger;
    private int totalPages;
    private boolean last;
    private int numberOfElements;
    private boolean first;
    private Object sort;
    private int size;
    private int number;

    public ArrayList<Content> getContent() {
        return content;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public int getTotalElementsInteger() {
        return totalElementsInteger;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public boolean isFirst() {
        return first;
    }

    public Object getSort() {
        return sort;
    }

    public int getSize() {
        return size;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Root{" +
                "\ncontent=" + getContent() +
                ", \ntotalElements=" + getTotalElements() +
                ", \ntotalElementsInteger=" + getTotalElementsInteger() +
                ", \ntotalPages=" + getTotalPages() +
                ", \nlast=" + isLast() +
                ", \nnumberOfElements=" + getNumberOfElements() +
                ", \nfirst=" + isFirst() +
                ", \nsort=" + getSort() +
                ", \nsize=" + getSize() +
                ", \nnumber=" + getNumber() +
                '}';
    }
}


