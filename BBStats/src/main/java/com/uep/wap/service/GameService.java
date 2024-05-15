package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.GameDTO;
import com.uep.wap.model.Game;
import com.uep.wap.repository.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    
    public void addGame(GameDTO gameDTO) {
        Game game = new Game();
        game.setOpponent(gameDTO.getOpponent());
        game.setDate(gameDTO.getDate());
        gameRepository.save(game);
        System.out.println("Game Data");
    }

    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }    

}