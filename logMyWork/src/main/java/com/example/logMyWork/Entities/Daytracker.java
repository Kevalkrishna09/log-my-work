package com.example.logMyWork.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "daytracker")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Daytracker {

    @Id
    @Column(name = "daytracker_id")
    private Integer daytrackerId;

    @Column(name = "total_hours", nullable = false)
    private double totalHours;

    @Column(name = "type", length = 10, nullable = false)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "daytracker", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Timecard> timecards;
}