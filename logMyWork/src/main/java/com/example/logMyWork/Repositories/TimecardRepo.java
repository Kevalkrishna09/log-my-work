package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Timecard;

public interface TimecardRepo extends JpaRepository<Timecard, Integer> {

}