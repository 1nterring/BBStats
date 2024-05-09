package com.uep.wap.dto;

import java.util.List;

public class CoachDataDTO {
    List<CoachDTO> coaches;

    public List<CoachDTO> getPeople() {
        return coaches;
    }

    public void setPeople(List<CoachDTO> people) {
        this.coaches = coaches;
    }
}
