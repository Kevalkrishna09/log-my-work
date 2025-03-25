package com.example.logMyWork.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "timecard")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timecard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timecard_id")
    private Integer timecardId;

    @Column(name = "log_timestamp")
    private LocalDateTime logTimestamp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daytracker_id")
    private Daytracker daytracker;

    @Column(name = "hours_worked")
    private double hoursWorked;

    @Column(name = "work_type", length = 15)
    private String workType;
}