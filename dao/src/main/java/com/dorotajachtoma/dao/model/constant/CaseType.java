package com.dorotajachtoma.dao.model.constant;

public enum CaseType {
    UNCATEGORIZED("UNCATEGORIZED"),
    INFRACTION("INFRACTION"),
    MISDEMEANOR("MISDEMEANOR"),
    FELONY("FELONY");

    private String type;

    CaseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
