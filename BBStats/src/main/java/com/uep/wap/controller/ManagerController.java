package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.ManagerDTO;
import com.uep.wap.model.Manager;
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
    @PutMapping("/managerUpdate/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id, @RequestBody ManagerDTO managerDTO) {
        Manager updatedManager = managerService.updateManager(id, managerDTO);
        return ResponseEntity.ok(updatedManager);
    }
    @DeleteMapping("managerDelete/{id}")
    public ResponseEntity<String> deleteManager(@PathVariable Long id) {
    managerService.deleteManager(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Manager deleted!");
    }
}
