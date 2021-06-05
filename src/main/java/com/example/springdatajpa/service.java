package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private JpaRepository repository;

    public Object getVals() {
        return repository.findAll();
        
    }


    public void postDetails(employe emp) {
        repository.save(emp);
    }
}
