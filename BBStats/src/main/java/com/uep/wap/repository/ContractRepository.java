package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract,Integer> {

}
