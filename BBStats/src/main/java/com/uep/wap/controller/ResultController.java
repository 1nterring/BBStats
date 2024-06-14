package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.ResultDTO;
import com.uep.wap.model.Result;
import com.uep.wap.service.ResultService;

@RestController
@RequestMapping(path = "/api")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping(path = "/results")
    public Iterable<Result> getAllResults(){
        return resultService.getAllResults();
    }

    @PostMapping(path = "/resultAdd")
    public String addResult(@RequestBody ResultDTO resultDTO){
        resultService.addResult(resultDTO);
        return "Inserted";
    }
    @PutMapping("/result/{id}")
    public ResponseEntity<Result> updateResult(@PathVariable Long id, @RequestBody ResultDTO resultDTO) {
        Result updatedResult = resultService.updateResult(id, resultDTO);
        return ResponseEntity.ok(updatedResult);
    }

}
