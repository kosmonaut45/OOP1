package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("Full-Time"), PART_TIME("Part-Time");

    private String displayType;

    public String getDisplayType() {
        return displayType;
    }

    ContractType(String displayType){
        this.displayType = displayType;
    }
}
