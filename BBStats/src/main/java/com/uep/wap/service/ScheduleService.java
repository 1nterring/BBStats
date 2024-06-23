package com.uep.wap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uep.wap.dto.ScheduleDTO;
import com.uep.wap.model.Schedule;
import com.uep.wap.repository.ScheduleRepository;

import java.util.Optional;

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
    public Schedule updateSchedule(Long id, ScheduleDTO scheduleDTO) {
        Optional<Schedule> optionalSchedule = scheduleRepository.findById(id);
        if (optionalSchedule.isPresent()) {
            Schedule schedule = optionalSchedule.get();

            schedule.setDateOfMatch(scheduleDTO.getDateOfMatch());

            return scheduleRepository.save(schedule);
        } else {
            throw new RuntimeException("Schedule not found");
        }
    }
    public void deleteSchedule(Long id) {
        if (scheduleRepository.existsById(id)) {
            scheduleRepository.deleteById(id);
            System.out.println("Schedule " + id + " has been deleted.");
        } else {
            throw new RuntimeException("Schedule not found");
        }
    }
}