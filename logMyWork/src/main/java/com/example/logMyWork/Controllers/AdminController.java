package com.example.logMyWork.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.logMyWork.Forms.EmployeeAddForm;



@Controller
@RequestMapping("/admin")
public class AdminController {
//add employee
  

    @GetMapping("/addEmployee")
    public String displayAddEmployeePage(Model model){

        model.addAttribute("employeeAddForm",new EmployeeAddForm());
        return "Admin/addEmployee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployeePage(@ModelAttribute EmployeeAddForm employeeAddForm){
        //logic to save the employee by converting the data into eomployee obje
        // model.addAttribute("employeeAddForm",employeeAddForm);
        System.out.println(">>>>>>>>>"+employeeAddForm);
        return "";
    }


    //add manager
}
