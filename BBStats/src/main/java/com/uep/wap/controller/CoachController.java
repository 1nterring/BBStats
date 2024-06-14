package com.uep.wap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.CoachDTO;
import com.uep.wap.model.Coach;
import com.uep.wap.service.CoachService;

@RestController
@RequestMapping(path = "/api")
public class CoachController {
    private final CoachService coachService;

    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping(path = "/coaches")
    public Iterable<Coach> getAllCoaches(){
        return coachService.getAllCoaches();
    }

    @PostMapping(path = "/coachAdd")
    public String addCoach(@RequestBody CoachDTO coachDTO){
        coachService.addCoach(coachDTO);
        return "Inserted";
    }

    @PutMapping("/coach/{id}")
    public ResponseEntity<Coach> updateCoach(@PathVariable Long id, @RequestBody CoachDTO coachDTO) {
        Coach updatedCoach = coachService.updateCoach(id, coachDTO);
        return ResponseEntity.ok(updatedCoach);
    }

}
