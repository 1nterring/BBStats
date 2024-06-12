package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Result;

@Repository
public interface ResultRepository extends CrudRepository<Result,Long> {

}
