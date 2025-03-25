package com.example.logMyWork.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer taskId;

    @Column(name = "task_name", length = 20, nullable = false)
    private String taskName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "effort")
    private int effort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sprint_no")
    private Sprint sprint;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "description", length = 20)
    private String description;
}