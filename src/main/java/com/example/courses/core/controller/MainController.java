package com.example.courses.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired


    @RequestMapping("/")
    @ResponseBody
    public String index(){


        String response = "Sistema School ejecutandose";
        return response;
    }
}
