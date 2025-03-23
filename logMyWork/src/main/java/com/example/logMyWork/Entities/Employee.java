package com.example.logMyWork.Entities;



import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "employee")  // Maps to the table name in the database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment strategy
    private Integer empId;

    @Column(name = "emp_name", nullable = false, length = 20)
    private String empName;

    @Column(name = "designation", length = 20)
    private String designation;

    @Column(name = "team_id")
    private Integer teamId;

    @ManyToOne
    @JoinColumn(name = "manager_id") // Self-referencing foreign key
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
