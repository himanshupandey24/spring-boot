package org.springlearning.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springlearning.beans.Vehicle;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {

     /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */

    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(name = "bmwVehicle")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean(name = "hondaVehicle")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }


}
