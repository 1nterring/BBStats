package com.uep.wap.controller;

import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.ContractDTO;
import com.uep.wap.model.Contract;
import com.uep.wap.service.ContractService;

@RestController
@RequestMapping(path = "/api")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    /*@GetMapping(path = "/contracts")
    public Iterable<Contract> getAllContracts(){
        return contractService.getAllContracts();
    }

    @PostMapping(path = "/contractAdd")
    public String addContract(@RequestBody ContractDTO contractDTO){
        contractService.addContract(contractDTO);
        return "Inserted";
    }*/

}
