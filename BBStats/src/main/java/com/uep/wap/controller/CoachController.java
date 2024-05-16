package com.uep.wap.controller;

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

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello!";
    }

    @GetMapping(path = "/coaches")
    public Iterable<Coach> getAllCoaches(){
        return coachService.getAllCoaches();
    }

    @PostMapping(path = "/coachAdd")
    public String addPlayer(@RequestBody CoachDTO coachDTO){
        coachService.addCoach(coachDTO);
        return "Inserted";
    }

}
