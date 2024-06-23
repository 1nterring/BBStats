package com.uep.wap.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.service.PlayerService;

@RestController
@RequestMapping(path = "/api")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello!";
    }

    @GetMapping(path = "/players")
    public Iterable<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping(path = "/playerAdd")
    public String addPlayer(@RequestBody PlayerDTO playerDTO){
        playerService.addPlayer(playerDTO);
        return "Inserted";
    }
    @PutMapping("/playerUpdate/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody PlayerDTO playerDTO) {
        Player updatedPlayer = playerService.updatePlayer(id, playerDTO);
        return ResponseEntity.ok(updatedPlayer);
    }
    @DeleteMapping("playerDelete/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long id) {
    playerService.deletePlayer(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Player deleted!");
    }
}
