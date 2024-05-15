package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.uep.wap.model.Statistician;

@Repository
public interface StatisticianRepository extends CrudRepository<Statistician,Integer> {

}
