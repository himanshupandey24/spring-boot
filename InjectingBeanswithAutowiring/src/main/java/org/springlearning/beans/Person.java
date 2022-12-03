package org.springlearning.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private String name;

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
    /*@Autowired*/

    //@Autowired
    private Vehicle vehicle;

    @Autowired(required = false) // by default, it is true
    public Person(Vehicle vehicle){
        System.out.println("Person Constructor called");
        this.vehicle = vehicle;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    //@Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
