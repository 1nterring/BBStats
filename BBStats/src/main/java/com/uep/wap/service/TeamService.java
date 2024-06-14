package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.TeamDTO;
import com.uep.wap.model.Team;
import com.uep.wap.repository.TeamRepository;

import java.util.Optional;

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
    public Team updateTeam(Long id, TeamDTO teamDTO) {
        Optional<Team> optionalTeam = teamRepository.findById(id);
        if (optionalTeam.isPresent()) {
            Team team = optionalTeam.get();

            team.setName(teamDTO.getName());

            return teamRepository.save(team);
        } else {
            throw new RuntimeException("Team not found");
        }
    }
}