package com.priyanshi.ExamSchedule.repo;

import com.priyanshi.ExamSchedule.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<Schedule,Long> {
}
