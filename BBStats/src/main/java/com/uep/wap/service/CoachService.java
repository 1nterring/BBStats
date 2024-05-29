package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.CoachDTO;
import com.uep.wap.model.Coach;
import com.uep.wap.repository.CoachRepository;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;
    
    public void addCoach(CoachDTO coachDTO) {
        Coach coach = new Coach();
        coach.setFirstName(coachDTO.getFirstName());
        coach.setLastName(coachDTO.getLastName());
        coach.setTeam(coachDTO.getTeam());
        coach.setDateOfBirth(coachDTO.getDateOfBirth());
        coachRepository.save(coach);
        System.out.println("New Coach");
    }

    public Iterable<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }    

}