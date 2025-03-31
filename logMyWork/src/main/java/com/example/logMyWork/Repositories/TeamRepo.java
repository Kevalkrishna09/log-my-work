package com.example.logMyWork.Repositories;

import com.example.logMyWork.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {

    List<Team> findByProjectProjectId(Integer projectId);

    List<Team> findByManagerEmpId(Integer managerId);
}