package com.example.logMyWork.Repositories;

import com.example.logMyWork.Entities.Daytracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DaytrackerRepo extends JpaRepository<Daytracker, Integer> {

    List<Daytracker> findByEmployeeEmpId(Integer employeeId);

    List<Daytracker> findByDate(LocalDate date);

    List<Daytracker> findByType(String type);
}