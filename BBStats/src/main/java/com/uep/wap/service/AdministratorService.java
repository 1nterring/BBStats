package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.AdministratorDTO;
import com.uep.wap.model.Administrator;
import com.uep.wap.repository.AdministratorRepository;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;
    
    /*public void addAdministrator(AdministratorDTO administratorDTO) {
        Administrator administrator = new Administrator();
        administrator.setId(administratorDTO.getId());
        administratorRepository.save(administrator);
        System.out.println("Admin takes a part");
    }

    public Iterable<Administrator> getAllAdmins() {
        return administratorRepository.findAll();
    }    */

}