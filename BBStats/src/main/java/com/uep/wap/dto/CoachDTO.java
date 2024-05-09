package com.uep.wap.dto;

import com.uep.wap.model.Coach;

import java.security.Timestamp;

public class CoachDTO {
    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Timestamp dateOfBirth) {
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

}
