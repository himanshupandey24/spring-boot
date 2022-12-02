package org.springlearning.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlearning.beans.Vehicle;
import org.springlearning.config.ProjectConfig;

public class BeanCreationExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle1.getName());

        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);

    }
}
