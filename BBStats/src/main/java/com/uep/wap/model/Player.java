package com.uep.wap.model;

import java.sql.Timestamp; // Correct import

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // changed to lowercase

    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;
    private Float weight;
    private Float height;
    private Float wingspan;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @ManyToOne
    private Injury injury;

    private Float salary;

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWingspan() {
        return wingspan;
    }

    public void setWingspan(Float wingspan) {
        this.wingspan = wingspan;
    }

}
