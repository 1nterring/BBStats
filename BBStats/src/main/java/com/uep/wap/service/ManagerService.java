package com.uep.wap.service;

import com.uep.wap.dto.CoachDTO;
import com.uep.wap.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ManagerDTO;
import com.uep.wap.model.Manager;
import com.uep.wap.repository.ManagerRepository;

import java.util.Optional;

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
    public Manager updateManager(Long id, ManagerDTO managerDTO) {
        Optional<Manager> optionalManager = managerRepository.findById(id);
        if (optionalManager.isPresent()) {
            Manager manager = optionalManager.get();

            manager.setFirstName(managerDTO.getFirstName());
            manager.setLastName(managerDTO.getLastName());

            return managerRepository.save(manager);
        } else {
            throw new RuntimeException("Manager not found");
        }
    }
    public void deleteManager(Long id) {
        if (managerRepository.existsById(id)) {
            managerRepository.deleteById(id);
            System.out.println("Manager " + id + " has been deleted.");
        } else {
            throw new RuntimeException("Manager not found");
        }
    }
}
