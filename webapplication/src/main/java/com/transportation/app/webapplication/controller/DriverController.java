package com.transportation.app.webapplication.controller;

import com.transportation.app.webapplication.models.Driver;
import com.transportation.app.webapplication.services.DriverService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;



@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;


    @Autowired
    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }

    @GetMapping("/listdriver")
    public String getAllDriver(Model model){
        List<Driver> drivers = driverService.getallDriver();
        model.addAttribute("listdriver", drivers);
        return "listdriver";
    }

    @GetMapping("/listdriver-add")
    public String get_add_Page(){
        return "listdriver-add";
    }

    @PostMapping("/listdriver-add")
    public String addNewDriver(@RequestParam(value = "name") String name,
                                @RequestParam(value = "personal_ID") String personal_ID,
                                @RequestParam(value = "sex") String sex){
        driverService.addnewDriver(name,personal_ID,sex);
    
        return "redirect:/listdriver";
    }

    @GetMapping("/listdriver-find")
    public String get_find_page(){
        return "listdriver-find";
    }

    @PostMapping("/listdriver-find")
    public String findDriver(@RequestParam(value = "str") String str, Model model){
        List<Driver> drivers = driverService.findbyString(str);
        model.addAttribute("list", drivers);
        return "listdriver-show";
    }

    //In profile of driver
    public void updateDriver(String name, String personal_ID, String sex){
    }

    //In profile of driver 
    public void deletedriver(){
    }
}
