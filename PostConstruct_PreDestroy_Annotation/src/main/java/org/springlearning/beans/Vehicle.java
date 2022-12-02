package org.springlearning.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }

    @PostConstruct
    public void initialize1(){
        //this.name = "Audi";
        System.out.println("We can assign @PostConstruct to multiple methods, and this is one of those methods");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle Class");
    }

    @PreDestroy
    public void destroy1(){
        System.out.println("We can assign @PreDestroy to multiple methods, and this is one of those methods");
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

}
