package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.TableOfMatchesDTO;
import com.uep.wap.model.TableOfMatches;
import com.uep.wap.repository.TableOfMatchesRepository;

@Service
public class TableOfMatchesService {

    @Autowired
    private TableOfMatchesRepository tableOfMatchesRepository;
    
    public void addTableOfMatches(TableOfMatchesDTO tableOfMatchesDTO) {
        TableOfMatches tableOfMatches = new TableOfMatches();
        tableOfMatches.setTeams(tableOfMatchesDTO.getTeams());
        System.out.println("Actual Table");
    }

    public Iterable<TableOfMatches> getTable() {
        return tableOfMatchesRepository.findAll();
     }    

}