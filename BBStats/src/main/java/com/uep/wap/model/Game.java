package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import java.security.Timestamp;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Timestamp date;
    private String opponent;
    @OneToOne
    @JoinColumn(name = "result_id")
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    @JoinColumn(name = "team_id")
    private Game game;
    public Timestamp getDate() {
        return date;
    }
    public Game getGame() {
        return game;
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
    public void setGame(Game game) {
        this.game = game;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }
}
