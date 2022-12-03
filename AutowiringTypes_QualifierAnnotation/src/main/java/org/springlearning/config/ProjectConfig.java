package org.springlearning.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springlearning.beans.Vehcile;

@Configuration
@ComponentScan(basePackages = "org.springlearning.beans")
public class ProjectConfig {
    @Bean
    Vehcile vehicle1(){
        var vehicle = new Vehcile();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    Vehcile vehicle2(){
        var vehicle = new Vehcile();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Primary
    @Bean
    Vehcile vehicle3(){
        var vehicle = new Vehcile();
        vehicle.setName("Ferrari");
        return vehicle;
    }
}
