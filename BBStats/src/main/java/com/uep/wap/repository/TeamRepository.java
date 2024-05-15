package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team,Integer> {

}
