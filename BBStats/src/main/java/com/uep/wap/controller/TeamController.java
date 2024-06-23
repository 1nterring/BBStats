package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PutMapping("/teamUpdate/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable Long id, @RequestBody TeamDTO teamDTO) {
        Team updatedTeam = teamService.updateTeam(id, teamDTO);
        return ResponseEntity.ok(updatedTeam);
    }
    @DeleteMapping("teamrDelete/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable Long id) {
    teamService.deleteTeam(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Team deleted!");
    }
}
