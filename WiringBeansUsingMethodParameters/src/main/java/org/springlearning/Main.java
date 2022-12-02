package org.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Person;
import org.springlearning.beans.Vehicle;
import org.springlearning.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}