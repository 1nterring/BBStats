package com.uep.wap.dto;

import com.uep.wap.model.Game;

import java.util.List;

public class GameDataDTO {

    List<GameDTO> games;

    public List<GameDTO> getPeople() {
        return games;
    }

    public void setPeople(List<GameDTO> people) {
        this.games = games;
    }
}
