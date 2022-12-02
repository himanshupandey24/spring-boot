package org.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Vehicle;
import org.springlearning.configs.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle2.getName());

        Vehicle vehicle3 = context.getBean("bmwVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle3.getName());
    }
}