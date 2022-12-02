package org.springlearning.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public Vehicle(){
        System.out.println("Vehicle Constructor called");
    }

    @PostConstruct
    public void initialize(){
        this.name = "Fortuner";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is : " + name;
    }
}
