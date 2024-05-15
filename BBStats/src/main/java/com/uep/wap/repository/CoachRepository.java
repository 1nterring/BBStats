package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Coach;

@Repository
public interface CoachRepository extends CrudRepository<Coach,Integer> {

}
