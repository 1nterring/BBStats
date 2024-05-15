package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Data;

@Repository
public interface DataRepository extends CrudRepository<Data,Integer> {

}
