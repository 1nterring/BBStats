package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import java.security.Timestamp;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private Timestamp dateOfBirth;
    private Float weight;
    private Float height;
    private Float wingspan;
    private Injury injury;
    private Float salary;
    private Team team;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    @ManyToOne
    @JoinColumn(name = "team_id")
    @JoinColumn(name = "coach_id")
    private Player player;
    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public Float getHeight() {
        return height;
    }
    public Long getId() {
        return Id;
    }
    public Injury getInjury() {
        return injury;
    }
    public String getLastName() {
        return lastName;
    }
    public Player getPlayer() {
        return player;
    }
    public Float getSalary() {
        return salary;
    }
    public Team getTeam() {
        return team;
    }
    public Float getWeight() {
        return weight;
    }
    public Float getWingspan() {
        return wingspan;
    }
    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setHeight(Float height) {
        this.height = height;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setInjury(Injury injury) {
        this.injury = injury;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public void setWingspan(Float wingspan) {
        this.wingspan = wingspan;
    }
}
