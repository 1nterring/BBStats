package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.TeamDTO;
import com.uep.wap.model.Team;
import com.uep.wap.repository.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;
    
    public void addTeam(TeamDTO teamDTO) {
        Team team = new Team();
        team.setName(teamDTO.getName());
        teamRepository.save(team);
        System.out.println("New Team in the League");
    }

    public Iterable<Team> getAllTeams() {
        return teamRepository.findAll();
    }    

}