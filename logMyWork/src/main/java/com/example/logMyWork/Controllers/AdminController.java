package com.example.logMyWork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
//add employee

    @GetMapping("/addEmployee")
    public String displayAddEmployeePage(){
        return "Admin/addEmployee";
    }

    //add manager
}
