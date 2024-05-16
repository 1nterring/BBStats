package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.GameDTO;
import com.uep.wap.model.Game;
import com.uep.wap.service.GameService;

@RestController
@RequestMapping(path = "/api")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping(path = "/games")
    public Iterable<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @PostMapping(path = "/gameAdd")
    public String addGame(@RequestBody GameDTO gameDTO){
        gameService.addGame(gameDTO);
        return "Inserted";
    }

}
