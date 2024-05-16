package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.TeamDTO;
import com.uep.wap.model.Team;
import com.uep.wap.service.TeamService;

@RestController
@RequestMapping(path = "/api")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping(path = "/teams")
    public Iterable<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @PostMapping(path = "/teamAdd")
    public String addTeam(@RequestBody TeamDTO teamDTO){
        teamService.addTeam(teamDTO);
        return "Inserted";
    }

}
