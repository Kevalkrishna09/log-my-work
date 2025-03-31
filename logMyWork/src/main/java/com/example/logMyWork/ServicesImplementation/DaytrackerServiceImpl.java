package com.example.logMyWork.ServicesImplementation    ;

import com.example.logMyWork.Entities.Daytracker;
import com.example.logMyWork.Repositories.DaytrackerRepo;
import com.example.logMyWork.Services.DaytrackerService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DaytrackerServiceImpl implements DaytrackerService {

    private final DaytrackerRepo daytrackerRepo;

    public DaytrackerServiceImpl(DaytrackerRepo daytrackerRepo) {
        this.daytrackerRepo = daytrackerRepo;
    }

    @Override
    public Daytracker saveDaytracker(Daytracker daytracker) {
        return daytrackerRepo.save(daytracker);
    }

    @Override
    public Optional<Daytracker> updateDaytracker(Daytracker daytracker) {
        if (daytracker.getDaytrackerId() != null && daytrackerRepo.existsById(daytracker.getDaytrackerId())) {
            return Optional.of(daytrackerRepo.save(daytracker));
        }
        return Optional.empty();
    }

    @Override
    public void deleteDaytracker(Integer daytrackerId) {
        daytrackerRepo.deleteById(daytrackerId);
    }

    @Override
    public List<Daytracker> getAllDaytrackers() {
        return daytrackerRepo.findAll();
    }

    @Override
    public Optional<Daytracker> getDaytrackerById(Integer daytrackerId) {
        return daytrackerRepo.findById(daytrackerId);
    }

    @Override
    public List<Daytracker> getDaytrackersByEmployeeId(Integer employeeId) {
        return daytrackerRepo.findByEmployeeEmpId(employeeId);
    }

    @Override
    public List<Daytracker> getDaytrackersByDate(LocalDate date) {
        return daytrackerRepo.findByDate(date);
    }

    @Override
    public List<Daytracker> getDaytrackersByType(String type) {
        return daytrackerRepo.findByType(type);
    }
}