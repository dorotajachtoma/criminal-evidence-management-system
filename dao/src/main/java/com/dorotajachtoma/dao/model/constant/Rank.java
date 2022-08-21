package com.dorotajachtoma.dao.model.constant;

public enum Rank {
    TRAINEE("TRAINEE"),
    JUNIOR("JUNIOR"),
    SENIOR("SENIOR"),
    INSPECTOR("INSPECTOR"),
    CHIEF_INSPECTOR("CHIEF_INSPECTOR");

    private String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
