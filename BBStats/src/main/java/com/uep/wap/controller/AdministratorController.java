package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.AdministratorDTO;
import com.uep.wap.model.Administrator;
import com.uep.wap.service.AdministratorService;

@RestController
@RequestMapping(path = "/api")
public class AdministratorController {

    private final AdministratorService administratorService;

    public AdministratorController(AdministratorService administratorService) {
        this.administratorService = administratorService;
    }

    @GetMapping(path = "/administrators")
    public Iterable<Administrator> getAllAdministrators(){
        return administratorService.getAllAdministrators();
    }

    @PostMapping(path = "/administratorAdd")
    public String addAdministrator(@RequestBody AdministratorDTO administratorDTO){
        administratorService.addAdministrator(administratorDTO);
        return "Inserted";
    }
}
