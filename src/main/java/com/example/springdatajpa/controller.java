package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private service service;

    @RequestMapping("/getjpa")
    public Object method(){
        return service.getVals();
    }
    @RequestMapping(value = "/gatjpa",method = RequestMethod.POST)
    public void method2(@RequestBody employe emp){
        service.postDetails(emp);
    }
}
