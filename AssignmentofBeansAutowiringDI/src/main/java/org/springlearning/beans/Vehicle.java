package org.springlearning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springlearning.services.VehicleServices;

import javax.annotation.PostConstruct;

@Component("vehicleBean")
public class Vehicle {
    private String name;
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        this.vehicleServices = vehicleServices;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Audi";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
