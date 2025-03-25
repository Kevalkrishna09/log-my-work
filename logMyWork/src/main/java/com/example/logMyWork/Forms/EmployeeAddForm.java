package com.example.logMyWork.Forms;

import java.util.Date;

import com.example.logMyWork.Entities.Employee;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Data
public class EmployeeAddForm {
    private String name;

    private String designation;

 
    private Integer teamId; 

   
    private Employee managerId;


    
    private Date dateOfBirth;

    private Date joiningDate;

 
    
    private String email;

    private String phoneNumber;

}
