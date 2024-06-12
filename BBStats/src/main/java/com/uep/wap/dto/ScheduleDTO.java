package com.uep.wap.dto;
import java.sql.Timestamp;

public class ScheduleDTO {

    private Timestamp dateOfMatch;
    public Timestamp getDateOfMatch() {
        return dateOfMatch;
    }
    public void setDateOfMatch(Timestamp dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }
}
