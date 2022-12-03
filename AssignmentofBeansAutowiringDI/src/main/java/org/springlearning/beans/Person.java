package org.springlearning.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component(value="personBean")
public class Person {
    private String name;
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Hi-Man";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
