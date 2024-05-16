package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.DataControllerDTO;
import com.uep.wap.model.DataController;
import com.uep.wap.service.DataControllerService;

@RestController
@RequestMapping(path = "/api")
public class DataController {

    private final DataControllerService dataControllerService;

    public DataController(DataControllerService dataControllerService) {
        this.dataControllerService = dataControllerService;
    }

    @GetMapping(path = "/dataControllers")
    public Iterable<DataController> getAllDataControllers(){
        return dataControllerService.getAllDataControllers();
    }

    @PostMapping(path = "/dataControllerAdd")
    public String addDataController(@RequestBody DataControllerDTO dataControllerDTO){
        dataControllerService.addDataController(dataControllerDTO);
        return "Inserted";
    }
}
