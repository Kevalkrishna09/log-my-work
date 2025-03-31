package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Daytracker;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DaytrackerService {

    Daytracker saveDaytracker(Daytracker daytracker);

    Optional<Daytracker> updateDaytracker(Daytracker daytracker);

    void deleteDaytracker(Integer daytrackerId);

    List<Daytracker> getAllDaytrackers();

    Optional<Daytracker> getDaytrackerById(Integer daytrackerId);

    List<Daytracker> getDaytrackersByEmployeeId(Integer employeeId);

    List<Daytracker> getDaytrackersByDate(LocalDate date);

    List<Daytracker> getDaytrackersByType(String type);
}