package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ScheduleDTO;
import com.uep.wap.model.Schedule;
import com.uep.wap.repository.ScheduleRepository;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;
    
    public void addSchedule(ScheduleDTO scheduleDTO) {
         Schedule schedule = new Schedule();
         schedule.setDateOfMatch(scheduleDTO.getDateOfMatch());
        scheduleRepository.save(schedule);
        System.out.println("New Date Of Match");
     }

    public Iterable<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
     }    

}