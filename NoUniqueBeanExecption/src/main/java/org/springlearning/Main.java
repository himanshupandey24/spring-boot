package org.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Vehicle;
import org.springlearning.configs.ProjectConfig;

public class Main {
    public static void main(String[] args) {

         /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //NoUniqueBeanDefinitionException: No qualifying bean of type 'org.springlearning.beans.Vehicle'
        //Vehicle vehicle = context.getBean(Vehicle.class);
        Vehicle vehicle = context.getBean("getAudi",Vehicle.class);


        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
    }
}