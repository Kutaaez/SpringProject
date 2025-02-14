package config;

import beans.Smartphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.awt.image.ImageProducer;

@Configuration
@ComponentScan(basePackages = "beans") //added this code because, chtoby ukazat gde nashi beans nahodyatsa.
    public class AppConfig {
    @Bean
    Smartphone samsung() {
        Smartphone samsung = new Smartphone();
        samsung.setBrand("Samsung");
        return samsung;
    }

    @Bean
    @Primary
    Smartphone iphone() {
        Smartphone iphone = new Smartphone();
        iphone.setBrand("iPhone");
        return iphone;
    }
    @Bean
    Smartphone Xiaomi(){
        Smartphone xiaomi = new Smartphone();
        xiaomi.setBrand("Xiaomi");
        return xiaomi;
    }
}

