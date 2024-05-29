package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.TableOfMatchesDTO;
import com.uep.wap.model.TableOfMatches;
import com.uep.wap.service.TableOfMatchesService;

@RestController
@RequestMapping(path = "/api")
public class TableOfMatchesController {

    private final TableOfMatchesService tableOfMatchesService;

    public TableOfMatchesController(TableOfMatchesService tableOfMatchesService) {
        this.tableOfMatchesService = tableOfMatchesService;
    }

    /*@GetMapping(path = "/tablesOfMatches")
    public Iterable<TableOfMatches> getAllTablesOfMatches(){
        return tableOfMatchesService.getAllTablesOfMatches();
    }

    @PostMapping(path = "/tableOfMatchesAdd")
    public String addTableOfMatches(@RequestBody TableOfMatchesDTO tableOfMatchesDTO){
        tableOfMatchesService.addTableOfMatches(tableOfMatchesDTO);
        return "Inserted";
    }*/

}
