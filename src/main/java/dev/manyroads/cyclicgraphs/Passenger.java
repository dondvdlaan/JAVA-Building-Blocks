package dev.manyroads.cyclicgraphs;

public class Passenger {

    private String firstName;
    private String lastName;
    private Flight flight;

    public Passenger() {
        this.firstName = "noName";
        this.lastName = "noName";
        this.flight = new Flight();
    }

    public Passenger(String firstName, String lastName, Flight flight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flight = flight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
