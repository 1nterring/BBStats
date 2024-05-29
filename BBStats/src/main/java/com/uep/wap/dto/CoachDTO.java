package com.uep.wap.dto;

import com.uep.wap.model.Coach;
import com.uep.wap.model.Team;

import java.security.Timestamp;

public class CoachDTO {
    private String firstName;
    private String lastName;
    private java.sql.Timestamp dateOfBirth;
    private Team team;

    public java.sql.Timestamp getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(java.sql.Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
        public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
