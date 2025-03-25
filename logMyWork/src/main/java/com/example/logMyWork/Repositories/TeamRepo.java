package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Team;

public interface TeamRepo extends JpaRepository<Team, Integer> {

}