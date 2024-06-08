package com.uep.wap.dto;

import java.sql.Timestamp;

public class GameDTO {

    private Timestamp date;
    private String opponent;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }


    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

}
