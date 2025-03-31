package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Sprint;
import com.example.logMyWork.Repositories.SprintRepo;
import com.example.logMyWork.Services.SprintService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SprintServiceImpl implements SprintService {

    private final SprintRepo sprintRepo;

    public SprintServiceImpl(SprintRepo sprintRepo) {
        this.sprintRepo = sprintRepo;
    }

    @Override
    public Sprint saveSprint(Sprint sprint) {
        return sprintRepo.save(sprint);
    }

    @Override
    public Optional<Sprint> updateSprint(Sprint sprint) {
        if (sprint.getSprintNo() != null && sprintRepo.existsById(sprint.getSprintNo())) {
            return Optional.of(sprintRepo.save(sprint));
        }
        return Optional.empty();
    }

    @Override
    public void deleteSprint(Integer sprintNo) {
        sprintRepo.deleteById(sprintNo);
    }

    @Override
    public List<Sprint> getAllSprints() {
        return sprintRepo.findAll();
    }

    @Override
    public Optional<Sprint> getSprintById(Integer sprintNo) {
        return sprintRepo.findById(sprintNo);
    }

    @Override
    public List<Sprint> getSprintsByDateRange(String startDate, String endDate) {
        LocalDateTime start = LocalDateTime.parse(startDate);
        LocalDateTime end = LocalDateTime.parse(endDate);
        return sprintRepo.findByStartDateBetween(start, end);
    }
}