package org.springlearning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.springlearning.beans", "org.springlearning.implementation", "org.springlearning.services"})
public class ProjectConfig {
}
