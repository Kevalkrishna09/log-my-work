package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Timecard;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TimecardService {

    Timecard saveTimecard(Timecard timecard);

    Optional<Timecard> updateTimecard(Timecard timecard);

    void deleteTimecard(Integer timecardId);

    List<Timecard> getAllTimecards();

    Optional<Timecard> getTimecardById(Integer timecardId);

    List<Timecard> getTimecardsByEmployeeId(Integer employeeId);

    List<Timecard> getTimecardsByTaskId(Integer taskId);

    List<Timecard> getTimecardsByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    List<Timecard> getTimecardsByWorkType(String workType);
}