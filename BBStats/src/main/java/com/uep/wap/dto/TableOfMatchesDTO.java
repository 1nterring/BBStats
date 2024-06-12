package com.uep.wap.dto;

import java.util.List;

import com.uep.wap.model.Team;

public class TableOfMatchesDTO {

    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
