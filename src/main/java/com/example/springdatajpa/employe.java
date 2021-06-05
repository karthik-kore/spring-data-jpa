package com.example.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employe {
    @Id
    int id;
    String name;
    int salary;

    public employe() {
    }

    public employe(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}