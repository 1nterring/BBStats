package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.CoachDTO;
import com.uep.wap.model.Coach;
import com.uep.wap.repository.CoachRepository;

import java.util.Optional;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;
    
    public void addCoach(CoachDTO coachDTO) {
        Coach coach = new Coach();
        coach.setFirstName(coachDTO.getFirstName());
        coach.setLastName(coachDTO.getLastName());
        coach.setDateOfBirth(coachDTO.getDateOfBirth());
        coachRepository.save(coach);
        System.out.println("New Coach");
    }

    public Iterable<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }
    public Coach updateCoach(Long id, CoachDTO coachDTO) {
        Optional<Coach> optionalCoach = coachRepository.findById(id);
        if (optionalCoach.isPresent()) {
            Coach coach = optionalCoach.get();

            coach.setFirstName(coachDTO.getFirstName());
            coach.setLastName(coachDTO.getLastName());
            coach.setDateOfBirth(coachDTO.getDateOfBirth());

            return coachRepository.save(coach);
        } else {
            throw new RuntimeException("Coach not found");
        }
    }
    public void deleteCoach(Long id) {
        if (coachRepository.existsById(id)) {
            coachRepository.deleteById(id);
            System.out.println("Coach " + id + " has been deleted.");
        } else {
            throw new RuntimeException("Coach not found");
        }
    }
}