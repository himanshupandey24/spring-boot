package org.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Person;
import org.springlearning.beans.Vehicle;
import org.springlearning.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person =  context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
         /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}