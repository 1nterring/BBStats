package com.uep.wap.controller;

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

}
