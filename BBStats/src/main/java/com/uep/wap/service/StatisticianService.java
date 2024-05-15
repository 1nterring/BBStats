package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.StatisticianDTO;
import com.uep.wap.model.Statistician;
import com.uep.wap.repository.StatisticianRepository;

@Service
public class StatisticianService {

    @Autowired
    private StatisticianRepository statisticianRepository;
    
    public void addStatistician(StatisticianDTO statisticianDTO) {
        Statistician statistician = new Statistician();
        statistician.setFirstName(statisticianDTO.getFirstName());
        statistician.setLastName(statisticianDTO.getLastName());
        statisticianRepository.save(statistician);
        System.out.println("New Manager incoming");
    }

    public Iterable<Statistician> getAllStatistics() {
        return statisticianRepository.findAll();
    }    

}