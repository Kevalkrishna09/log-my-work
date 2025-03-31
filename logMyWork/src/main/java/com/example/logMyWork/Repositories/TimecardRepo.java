package com.example.logMyWork.Repositories;

import com.example.logMyWork.Entities.Timecard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TimecardRepo extends JpaRepository<Timecard, Integer> {

    List<Timecard> findByEmployeeEmpId(Integer employeeId);

    List<Timecard> findByTaskTaskId(Integer taskId);

    List<Timecard> findByLogTimestampBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Timecard> findByWorkType(String workType);
}