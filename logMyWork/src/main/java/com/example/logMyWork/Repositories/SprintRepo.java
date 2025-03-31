package com.example.logMyWork.Repositories;

import com.example.logMyWork.Entities.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SprintRepo extends JpaRepository<Sprint, Integer> {

    List<Sprint> findByStartDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
