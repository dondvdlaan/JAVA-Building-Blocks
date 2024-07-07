package dev.manyroads.interfaces;

import java.time.LocalDateTime;

public class SmartHomeController {

    IDateTimeProvider iDateTimeProvider;

    public SmartHomeController(IDateTimeProvider iDateTimeProvider) {
        this.iDateTimeProvider = iDateTimeProvider;
    }

    public String actuateLights() {
        return getTimeOfDay(iDateTimeProvider.getLocalDateTime());
    }

    public String getTimeOfDay(LocalDateTime localDateTime) {
        String timeOfDay = "";
        if (localDateTime.getHour() > 0 && localDateTime.getHour() < 6)
            timeOfDay = " nacht";
        else
            timeOfDay = "day";

        return timeOfDay;
    }

    public static void main(String[] args) {

        SmartHomeController smartHomeController =
                new SmartHomeController(new RegelHome(LocalDateTime.now().plusHours(3)));

        System.out.println(smartHomeController.actuateLights());

    }
}