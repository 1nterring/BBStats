package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import java.security.Timestamp;

import javax.persistence.*;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "team_id")
    @OneToMany(mappedBy = "coach", cascade = CascadeType.ALL)
    private Coach coach;
    public Coach getCoach() {
        return coach;
    }
    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public Long getId() {
        return Id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
