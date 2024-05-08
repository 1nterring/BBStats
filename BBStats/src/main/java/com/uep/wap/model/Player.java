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
}
