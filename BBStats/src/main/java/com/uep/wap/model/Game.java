package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Timestamp date;
    private String opponent;
    @ManyToOne
    @JoinColumn(name = "result_id")
    private Game result;
    
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Game schedule;
    
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Timestamp getDate() {
        return date;
    }

    public Long getId() {
        return Id;
    }
    public String getOpponent() {
        return opponent;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }
}
