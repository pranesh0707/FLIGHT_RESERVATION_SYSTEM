package org.example;
import java.util.*;

public class FlightReservation {
    Map<String,Flight> flight ;

    public FlightReservation() {
        this.flight = new HashMap<>();


        this.flight.put("Kingfisher", new Flight("Kingfisher"));
        this.flight.put("Indigo", new Flight("Indigo"));
        this.flight.put("SpiceJet", new Flight("SpiceJet"));
        this.flight.put("AirAsia", new Flight("AirAsia"));
        this.flight.put("Vistara", new Flight("Vistara"));
        this.flight.put("GoFirst", new Flight("GoFirst"));
        this.flight.put("Air India", new Flight("Air India"));
        this.flight.put("Emirates", new Flight("Emirates"));
        this.flight.put("Qatar Airways", new Flight("Qatar Airways"));
        this.flight.put("Lufthansa", new Flight("Lufthansa"));

    }

    public String bookTickets(String flightname,String name,int age,int seats){
        Flight flights = flight.get(flightname);
        if(flights!=null){
            return flights.bookTicket(name,age,seats);
        }
        else {
             System.out.println("Booking failed.Flight Not Found");
             return null;
        }

    }

    public Boolean cancelTicket(String flightname,String bookingId){
        Flight flights = flight.get(flightname);
        if(flights!=null){
            return flights.cancelTicket(bookingId);
        }
        else {
            System.out.println("Cancellation failed.Flight Not Found");
            return null;
        }

    }

    public void displayDetails(String flightname){
        Flight flights = flight.get(flightname);
        if(flights!=null){
            flights.displayDetails();
        }
        else {
            System.out.println("Progress failed.Flight Not Found");

        }
    }

    public void printDetails(String flightname){
        Flight flights = flight.get(flightname);
        if(flights!=null){
            flights.printDetails();
        }
        else {
            System.out.println("Progress failed.Flight Not Found");

        }
    }

}
