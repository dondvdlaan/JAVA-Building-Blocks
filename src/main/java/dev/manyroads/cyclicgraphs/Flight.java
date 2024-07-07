package dev.manyroads.cyclicgraphs;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String flightNr;
    private List<Passenger> passengerList;

    public Flight() {
        this.flightNr = "-1";
        this.passengerList = new ArrayList<>();
    }

    public Flight(String flightNr, List<Passenger> passengerList) {
        this.flightNr = flightNr;
        this.passengerList = passengerList;
    }

    public String getFlightNr() {
        return flightNr;
    }

    public void setFlightNr(String flightNr) {
        this.flightNr = flightNr;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNr='" + flightNr + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }

    public static void main(String[] args) {

        Flight flight = new Flight();
        flight.setFlightNr("LH1111");
        Passenger passenger1 =new Passenger("app", "kuukel", flight);
        Passenger passenger2 =new Passenger("tutu", "hmmm", flight);
        flight.getPassengerList().add(passenger1);
        flight.getPassengerList().add(passenger2);

        System.out.println("flight: " + flight.getFlightNr());
        for (Passenger p: flight.passengerList){

            System.out.println("Passengers: " +
                    p.getFirstName() + " " +
                    p.getLastName());
        }

    }


}
