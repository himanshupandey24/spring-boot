package org.springlearning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name;
    private final Vehcile vehicle;

    @Autowired
    public Person(@Qualifier("vehicle1") Vehcile vehcile){
        System.out.println("Person constructor called");
        this.vehicle = vehcile;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Hi-man";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehcile getVehicle() {
        return vehicle;
    }
}
