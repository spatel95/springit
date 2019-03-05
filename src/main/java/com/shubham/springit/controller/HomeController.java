package com.shubham.springit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello Springit Home Page";
    }
}
