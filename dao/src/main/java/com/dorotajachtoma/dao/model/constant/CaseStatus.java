package com.dorotajachtoma.dao.model.constant;

public enum CaseStatus {
    SUBMITTED("SUBMITTED"),
    UNDER_INVESTIGATION("UNDER_INVESTIGATION"),
    IN_COURT("IN_COURT"),
    CLOSED("CLOSED"),
    DISMISSED("DISMISSED"),
    COLD("COLD");

    private String status;

    CaseStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
