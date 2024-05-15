package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uep.wap.model.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Integer> {

}
