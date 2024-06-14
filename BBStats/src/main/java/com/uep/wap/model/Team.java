package com.uep.wap.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id; 
    @Column
    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "table_of_matches_id")
    private TableOfMatches tableOfMatches;
    
    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Manager manager; 
    @OneToOne 
    @JoinColumn(name = "coach_id") 
    private Coach coach;
    public Team() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
