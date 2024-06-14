package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uep.wap.dto.ScheduleDTO;
import com.uep.wap.model.Schedule;
import com.uep.wap.service.ScheduleService;

@RestController
@RequestMapping(path = "/api")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping(path = "/schedules")
    public Iterable<Schedule> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }

    @PostMapping(path = "/scheduleAdd")
    public String addSchedule(@RequestBody ScheduleDTO scheduleDTO){
        scheduleService.addSchedule(scheduleDTO);
        return "Inserted";
    }
    @PutMapping("/schedule/{id}")
    public ResponseEntity<Schedule> updateSchedule(@PathVariable Long id, @RequestBody ScheduleDTO scheduleDTO) {
        Schedule updatedSchedule = scheduleService.updateSchedule(id, scheduleDTO);
        return ResponseEntity.ok(updatedSchedule);
    }
}
