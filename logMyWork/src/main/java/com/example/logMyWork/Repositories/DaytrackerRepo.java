package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Daytracker;

public interface DaytrackerRepo extends JpaRepository<Daytracker, Integer> {

}
