package com.uep.wap.service;

import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import com.uep.wap.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public void addPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        //player.setName(playerDTO.getName());
        //player.setPoints(playerDTO.getPoints());
        playerRepository.save(player);
        System.out.println("NEW PLAYER HAS COME TO MARKET!");
    }

    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
