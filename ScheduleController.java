package com.priyanshi.ExamSchedule.controller;

import com.priyanshi.ExamSchedule.model.Schedule;
import com.priyanshi.ExamSchedule.repo.ScheduleRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleRepo scheduleRepo;

    @GetMapping
    public List<Schedule> findAll(){
        return scheduleRepo.findAll();
    }

    @PostMapping
    public Schedule save(@NotNull @RequestBody Schedule schedule){
        return scheduleRepo.save(schedule);
    }

}
