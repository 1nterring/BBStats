package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ContractDTO;
import com.uep.wap.model.Contract;
import com.uep.wap.repository.ContractRepository;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;
    
   /*  public void addContract(ContractDTO contractDTO) {
        Contract contract = new Contract();
        contract.setFirstName(contractDTO.getFirstName());
        contract.setLastName(contractDTO.getLastName());
        contractRepository.save(contract);
        System.out.println("Contract signed");
    }

    public Iterable<Contract> getAllManagers() {
        return contractRepository.findAll();
    }    
*/
}