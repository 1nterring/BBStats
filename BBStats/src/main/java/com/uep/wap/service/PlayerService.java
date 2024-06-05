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
        player.setFirstName(playerDTO.getFirstName());
        player.setLastName(playerDTO.getLastName());
        player.setDateOfBirth(playerDTO.getDateOfBirth());
        player.setWeight(playerDTO.getWeight());
        player.setHeight(playerDTO.getHeight());
        player.setWingspan(playerDTO.getWingspan());
        player.setSalary(playerDTO.getSalary());
        playerRepository.save(player);
        System.out.println("NEW PLAYER HAS COME TO MARKET!");
    }

    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
