package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.DataDTO;
import com.uep.wap.model.Data;
import com.uep.wap.repository.DataRepository;

import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;
    
    public void addData(DataDTO dataDTO) {
         Data data = new Data();
         dataRepository.save(data);
         System.out.println("Data");
     }

     public Iterable<Data> getAllData() {
         return dataRepository.findAll();
     }
    public Data updateData(Long id, DataDTO dataDTO) {
        Optional<Data> optionalData = dataRepository.findById(id);
        if (optionalData.isPresent()) {
            Data data = optionalData.get();
            return dataRepository.save(data);
        } else {
            throw new RuntimeException("Data not found");
        }
    }

}