package org.springlearning;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Vehicle;
import org.springlearning.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");

        Supplier<Vehicle> volksWagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = ()->{
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if(randomNumber % 2 == 0){
            context.registerBean("volkswagen",
                    Vehicle.class,
                    ()-> {
                Vehicle vehicle = new Vehicle();
                vehicle.setName("Volkswagen");
                return vehicle;}
            );
        }else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try{
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Volkswagen Vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi Vehicle");
        }

        if(volksVehicle != null)
            System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
        else
            System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());

    }
}