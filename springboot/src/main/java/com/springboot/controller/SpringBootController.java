package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;

@RestController
@RequestMapping("/call")
public class SpringBootController {

    @RequestMapping("/get")
    public String call(){
        String res="is ok";
        return res;
    }
}
