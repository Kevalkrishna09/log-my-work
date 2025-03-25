package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Sprint;

public interface SprintRepo extends JpaRepository<Sprint, Integer> {

}