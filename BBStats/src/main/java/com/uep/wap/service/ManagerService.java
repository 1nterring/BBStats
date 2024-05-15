package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ManagerDTO;
import com.uep.wap.model.Manager;
import com.uep.wap.repository.ManagerRepository;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;
    
    public void addManager(ManagerDTO managerDTO) {
        Manager manager = new Manager();
        manager.setFirstName(managerDTO.getFirstName());
        manager.setLastName(managerDTO.getLastName());
        managerRepository.save(manager);
        System.out.println("New Manager incoming");
    }

    public Iterable<Manager> getAllManagers() {
        return managerRepository.findAll();
    }    

}
