package com.uep.wap.dto;

import java.util.List;

import com.uep.wap.model.Coach;
import com.uep.wap.model.Manager;
import com.uep.wap.model.Player;

public class TeamDTO {
    private String name;
    private List<Player> players;
    private Manager manager;
    private Coach coach;
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
