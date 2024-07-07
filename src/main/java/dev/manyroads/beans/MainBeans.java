package dev.manyroads.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainBeans implements CommandLineRunner {

    private final House house;

    private final Plot plot;

    // You can use as a parameter name the name of the bean to chose(ie method name = bean name), that is plot2 or plot
    public MainBeans(House house, @Qualifier("plot2")  Plot plot) {
    //public MainBeans(House house,  Plot plot2) {
        this.house = house;
        this.plot = plot;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainBeans.class);
        //var context = new AnnotationConfigApplicationContext(
        //        BeanConfiguration.class);

        //House h = context.getBean(House.class);
        //System.out.println("h: " + h.getName());
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("H: " + house.getHouseType());
        System.out.println("P: " + plot.getAreaPlot());
    }
}
