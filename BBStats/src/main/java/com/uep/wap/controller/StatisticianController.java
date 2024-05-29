package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.StatisticianDTO;
import com.uep.wap.model.Statistician;
import com.uep.wap.service.StatisticianService;

@RestController
@RequestMapping(path = "/api")
public class StatisticianController {

    private final StatisticianService statisticianService;

    public StatisticianController(StatisticianService statisticianService) {
        this.statisticianService = statisticianService;
    }

    /*@GetMapping(path = "/statisticians")
    public Iterable<Statistican> getaAllStatisticians(){
        return statisticianService.getaAllStatisticians();
    }

    @PostMapping(path = "/scheduleAdd")
    public String addStatistician(@RequestBody StatisticianDTO statisticianDTO){
        statisticianService.addStatistician(statisticianDTO);
        return "Inserted";
    }*/

}
