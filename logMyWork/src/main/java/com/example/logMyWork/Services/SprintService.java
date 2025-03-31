package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Sprint;

import java.util.List;
import java.util.Optional;

public interface SprintService {

    Sprint saveSprint(Sprint sprint);

    Optional<Sprint> updateSprint(Sprint sprint);

    void deleteSprint(Integer sprintNo);

    List<Sprint> getAllSprints();

    Optional<Sprint> getSprintById(Integer sprintNo);

    List<Sprint> getSprintsByDateRange(String startDate, String endDate);
}