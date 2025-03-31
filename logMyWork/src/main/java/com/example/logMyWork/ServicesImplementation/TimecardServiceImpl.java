package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Timecard;
import com.example.logMyWork.Repositories.TimecardRepo;
import com.example.logMyWork.Services.TimecardService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TimecardServiceImpl implements TimecardService {

    private final TimecardRepo timecardRepo;

    public TimecardServiceImpl(TimecardRepo timecardRepo) {
        this.timecardRepo = timecardRepo;
    }

    @Override
    public Timecard saveTimecard(Timecard timecard) {
        return timecardRepo.save(timecard);
    }

    @Override
    public Optional<Timecard> updateTimecard(Timecard timecard) {
        if (timecard.getTimecardId() != null && timecardRepo.existsById(timecard.getTimecardId())) {
            return Optional.of(timecardRepo.save(timecard));
        }
        return Optional.empty();
    }

    @Override
    public void deleteTimecard(Integer timecardId) {
        timecardRepo.deleteById(timecardId);
    }

    @Override
    public List<Timecard> getAllTimecards() {
        return timecardRepo.findAll();
    }

    @Override
    public Optional<Timecard> getTimecardById(Integer timecardId) {
        return timecardRepo.findById(timecardId);
    }

    @Override
    public List<Timecard> getTimecardsByEmployeeId(Integer employeeId) {
        return timecardRepo.findByEmployeeEmpId(employeeId);
    }

    @Override
    public List<Timecard> getTimecardsByTaskId(Integer taskId) {
        return timecardRepo.findByTaskTaskId(taskId);
    }

    @Override
    public List<Timecard> getTimecardsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return timecardRepo.findByLogTimestampBetween(startDate, endDate);
    }

    @Override
    public List<Timecard> getTimecardsByWorkType(String workType) {
        return timecardRepo.findByWorkType(workType);
    }
}
