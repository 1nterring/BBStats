package com.uep.wap.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Use 'id' instead of 'Id' for naming consistency

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players; // Assuming there is a Player class with a 'team' field

    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private Manager manager; // Assuming there is a Manager class with a 'team' field
    @ManyToOne // Changed from @OneToOne
    @JoinColumn(name = "coach_id") // Assuming coach_id is the foreign key column in the Team table
    private Coach coach;
    // Getters and Setters

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
