package com.example.logMyWork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    //Dashboard

    @GetMapping("/dashboard")
    public String displayEmployeeDashboard(){
        return "Employee/dashboard";
    }
    //create time card
    //
    //
    //

}
