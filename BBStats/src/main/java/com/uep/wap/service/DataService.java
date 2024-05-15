package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.DataDTO;
import com.uep.wap.model.Data;
import com.uep.wap.repository.DataRepository;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;
    
    // public void addData(DataDTO dataDTO) {
    //     Data data = new Data();
    //     data.setFirstName(dataDTO.getFirstName());
    //     data.setLastName(dataDTO.getLastName());
    //     dataRepository.save(data);
    //     System.out.println("Data");
    // }

    // public Iterable<Data> getAllManagers() {
    //     return dataRepository.findAll();
    // }    

}