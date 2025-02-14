package config;

import beans.Smartphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans") //added this code because, chtoby ukazat gde nahoditzca component.
    public class AppConfig {
    @Bean
   Smartphone smartphone(){
       Smartphone smartphone = new Smartphone();
       smartphone.setBrand("Samsung");
       return smartphone;
   }

    }
