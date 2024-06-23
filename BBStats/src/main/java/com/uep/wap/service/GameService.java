package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.GameDTO;
import com.uep.wap.model.Game;
import com.uep.wap.repository.GameRepository;

import java.util.Optional;

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
    public Game updateGame(Long id, GameDTO gameDTO) {
        Optional<Game> optionalGame = gameRepository.findById(id);
        if (optionalGame.isPresent()) {
            Game game = optionalGame.get();

            game.setOpponent(gameDTO.getOpponent());
            game.setDate(gameDTO.getDate());

            return gameRepository.save(game);
        } else {
            throw new RuntimeException("Game not found");
        }
    }
    public void deleteGame(Long id) {
        if (gameRepository.existsById(id)) {
            gameRepository.deleteById(id);
            System.out.println("Game " + id + " has been deleted.");
        } else {
            throw new RuntimeException("Game not found");
        }
    }
}