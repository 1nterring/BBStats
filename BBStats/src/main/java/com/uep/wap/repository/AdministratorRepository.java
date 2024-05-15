package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Administrator;

@Repository
public interface AdministratorRepository extends CrudRepository<Administrator,Integer> {

}
