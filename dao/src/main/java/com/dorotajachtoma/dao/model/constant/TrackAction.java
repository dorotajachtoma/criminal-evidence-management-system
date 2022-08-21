package com.dorotajachtoma.dao.model.constant;

public enum TrackAction {

    SUBMITTED("SUBMITTED"),
    RETRIEVED("RETRIEVED"),
    RETURNED("RETURNED");

    private String status;

    TrackAction(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
