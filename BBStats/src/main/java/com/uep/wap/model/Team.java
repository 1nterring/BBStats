package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    @ManyToOne
    @JoinColumn(name = "data_id")
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private Team team;
    public Team getTeam() {
        return team;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
