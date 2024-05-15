package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game,Integer> {

}
