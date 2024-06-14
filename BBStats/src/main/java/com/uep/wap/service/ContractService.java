package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ContractDTO;
import com.uep.wap.model.Contract;
import com.uep.wap.repository.ContractRepository;

import java.util.Optional;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;
    
   public void addContract(ContractDTO contractDTO) {
        Contract contract = new Contract();
        contract.setExpiryDate(contractDTO.getExpiryDate());
        contractRepository.save(contract);
        System.out.println("Contract signed");
    }

    public Iterable<Contract> getAllContracts() {
        return contractRepository.findAll();
    }
    public Contract updateContract(Long id, ContractDTO contractDTO) {
        Optional<Contract> optionalContract = contractRepository.findById(id);
        if (optionalContract.isPresent()) {
            Contract contract = optionalContract.get();

            contract.setExpiryDate(contractDTO.getExpiryDate());

            return contractRepository.save(contract);
        } else {
            throw new RuntimeException("Contract not found");
        }
    }
}