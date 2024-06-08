package com.uep.wap.dto;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.uep.wap.model.Schedule;

public class ScheduleDTO {

    private Timestamp dateOfMatch;
    public Timestamp getDateOfMatch() {
        return dateOfMatch;
    }
    public void setDateOfMatch(Timestamp dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }
}
