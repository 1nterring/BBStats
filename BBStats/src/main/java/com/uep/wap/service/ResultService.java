package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ResultDTO;
import com.uep.wap.model.Result;
import com.uep.wap.repository.ResultRepository;

import java.util.Optional;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;
    
    public void addResult(ResultDTO resultDTO) {
        Result result = new Result();
        result.setWinner(resultDTO.getWinner());
        result.setFinal_score(resultDTO.getFinal_score());
        resultRepository.save(result);
        System.out.println("Game has ended.");
    }

    public Iterable<Result> getAllResults() {
        return resultRepository.findAll();
    }
    public Result updateResult(Long id, ResultDTO resultDTO) {
        Optional<Result> optionalResult = resultRepository.findById(id);
        if (optionalResult.isPresent()) {
            Result result = optionalResult.get();

            result.setWinner(resultDTO.getWinner());
            result.setFinal_score(resultDTO.getFinal_score());

            return resultRepository.save(result);
        } else {
            throw new RuntimeException("Result not found");
        }
    }

}