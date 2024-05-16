package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.ManagerDTO;
import com.uep.wap.model.Managert;
import com.uep.wap.service.ManagerService;

@RestController
@RequestMapping(path = "/api")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping(path = "/managers")
    public Iterable<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }

    @PostMapping(path = "/managerAdd")
    public String addManager(@RequestBody ManagerDTO managerDTO){
        managerService.addManager(managerDTO);
        return "Inserted";
    }

}
