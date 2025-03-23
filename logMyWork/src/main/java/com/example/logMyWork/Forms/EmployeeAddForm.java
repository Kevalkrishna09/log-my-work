package com.example.logMyWork.Forms;

import java.util.Date;

import com.example.logMyWork.Entities.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.TemporalType;

public class EmployeeAddForm {
    private String designation;

 
    private Integer teamId;

   
    private Employee manager;


    

    private Date joiningDate;

 
    
    private String email;

    private String phoneNumber;

}
