package dev.manyroads.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static dev.manyroads.beans.House.HouseType.LOG;

@Configuration
public class BeanConfiguration {

    @Bean
    House house() {
        return new House(LOG, "HoutenHuis");
    }

    /* To distinguish between two beans with the same name change parameter name or @Qualifier in the class where you
    apply the beans
    */
    @Bean
    Plot plot() {
        return new Plot(12.34);
    }

    /*

     */
    @Bean
    Plot plot2(House house) {
        System.out.println("Overload house: " + house.getName());
        return new Plot(56.78);
    }
}
