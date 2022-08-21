package com.dorotajachtoma.dao.model.constant;

public enum EmploymentStatus {

    ACTIVE("ACTIVE"),
    SUSPENDED("SUSPENDED"),
    VACATION("VACATION"),
    UNDER_INVESTIGATION("UNDER_INVESTIGATION"),
    RETIRED("RETIRED");

    private String status;

    EmploymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
