package com.example.logMyWork.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LMWController {

    @RequestMapping("/home")
    public String displayHome(Model model){
        // model.addAttribute("email",email);

        return "homeview";
    }
}

