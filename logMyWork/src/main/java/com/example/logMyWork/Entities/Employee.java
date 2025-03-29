package com.example.logMyWork.Entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "emp_name", nullable = false, length = 20)
    private String empName;

    @Column(name = "designation", length = 20)
    private String designation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "joining_date")
    @Temporal(TemporalType.DATE)
    private Date joiningDate;

    @Column(name = "email", length = 30, unique = true)
    private String email;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;
}