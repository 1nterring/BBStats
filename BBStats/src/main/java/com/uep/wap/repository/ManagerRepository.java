package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Manager;

@Repository
public class ManagerRepository extends CrudRepository<Manager,Iterable> {

}