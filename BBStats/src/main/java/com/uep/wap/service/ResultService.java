package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ResultDTO;
import com.uep.wap.model.Result;
import com.uep.wap.repository.ResultRepository;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;
    
    public void addResult(ResultDTO resultDTO) {
        Result result = new Result();
        result.setWinner(resultDTO.getWinner());
        result.setWinnerScore(resultDTO.getWinnerScore());
        result.setLoserScore(resultDTO.getLoserScore());
        resultRepository.save(result);
        System.out.println("Game has ended.");
    }

    public Iterable<Result> getAllResults() {
        return resultRepository.findAll();
    }    

}