package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.DataDTO;
import com.uep.wap.model.Data;
import com.uep.wap.service.DataService;

@RestController
@RequestMapping(path = "/api")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
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
    @PutMapping("/dataUpdate/{id}")
    public ResponseEntity<Data> updateData(@PathVariable Long id, @RequestBody DataDTO dataDTO) {
        Data updatedData = dataService.updateData(id, dataDTO);
        return ResponseEntity.ok(updatedData);
    }
        @DeleteMapping("dataDelete/{id}")
    public ResponseEntity<String> deleteData(@PathVariable Long id) {
    dataService.deleteData(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Data deleted!");
    }
}
