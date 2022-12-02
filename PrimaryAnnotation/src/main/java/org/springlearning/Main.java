package org.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Vehicle;
import org.springlearning.configs.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());
    }
}