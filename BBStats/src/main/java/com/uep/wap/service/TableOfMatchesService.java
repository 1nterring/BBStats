package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.TableOfMatchesDTO;
import com.uep.wap.model.TableOfMatches;
import com.uep.wap.repository.TableOfMatchesRepository;

import java.util.Optional;

@Service
public class TableOfMatchesService {

    @Autowired
    private TableOfMatchesRepository tableOfMatchesRepository;
    
    public void addTableOfMatches(TableOfMatchesDTO tableOfMatchesDTO) {
        TableOfMatches tableOfMatches = new TableOfMatches();
        tableOfMatches.setTeams(tableOfMatchesDTO.getTeams());
        System.out.println("Actual Table");
    }

    public Iterable<TableOfMatches> getAllTablesOfMatches() {
        return tableOfMatchesRepository.findAll();
     }
    public TableOfMatches updateTableOfMatches(Long id, TableOfMatchesDTO tableOfMatchesDTO) {
        Optional<TableOfMatches> optionalTableOfMatches = tableOfMatchesRepository.findById(id);
        if (optionalTableOfMatches.isPresent()) {
            TableOfMatches tableOfMatches = optionalTableOfMatches.get();

            return tableOfMatchesRepository.save(tableOfMatches);
        } else {
            throw new RuntimeException("Table not found");
        }
    }
    public void deleteTableOfMatches(Long id) {
        if (tableOfMatchesRepository.existsById(id)) {
            tableOfMatchesRepository.deleteById(id);
            System.out.println("Table" + id + " has been deleted.");
        } else {
            throw new RuntimeException("Table not found");
        }
    }
}
