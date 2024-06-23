package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path = "/contracts")
    public Iterable<Contract> getAllContracts(){
        return contractService.getAllContracts();
    }

    @PostMapping(path = "/contractAdd")
    public String addContract(@RequestBody ContractDTO contractDTO){
        contractService.addContract(contractDTO);
        return "Inserted";
    }

    @PutMapping("/contractUpdate/{id}")
    public ResponseEntity<Contract> updateContract(@PathVariable Long id, @RequestBody ContractDTO contractDTO) {
        Contract updatedContract = contractService.updateContract(id, contractDTO);
        return ResponseEntity.ok(updatedContract);
    }
    @DeleteMapping("contractDelete/{id}")
    public ResponseEntity<String> deleteContract(@PathVariable Long id) {
    contractService.deleteContract(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Contract deleted!");
    }
}
