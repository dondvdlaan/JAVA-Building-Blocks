package dev.manyroads.interfaces;

import java.time.LocalDateTime;

/**
 * Inverter of Control, IoC, the interface is for the client to define the localDateTime, before connecting to the
 * SmartHomeController
 */
public class RegelHome implements IDateTimeProvider {

    private final LocalDateTime localDateTime;
    public RegelHome(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }
}
