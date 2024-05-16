package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.DataControllerDTO;
import com.uep.wap.model.Data;
import com.uep.wap.service.DataControllerService;

@RestController
@RequestMapping(path = "/api")
public class DataController {

    private final DataService dataService;

    public Data(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(path = "/data")
    public Iterable<Data> getAllData(){
        return dataService.getAllData();
    }

    @PostMapping(path = "/dataAdd")
    public String addData(@RequestBody DataDTO dataDTO){
        dataService.addData(dataDTO);
        return "Inserted";
    }
}
