package org.example;
import java.util.*;

public class Flight {
    private String flightName;
    private int seatsAvailable;
    private int ticketPrice;
    private Map<String, Passenger> bookings;
    private int bookingCounter;

    public Flight(String flightName) {
        this.flightName = flightName;
        this.seatsAvailable = 50;
        this.ticketPrice = 5000;
        this.bookings = new HashMap<>();
        this.bookingCounter = 0;
    }



    public String bookTicket(String name, int age, int seats) {
        if (seats <= seatsAvailable) {
            bookingCounter++;
            ticketPrice += 200*seats;
            seatsAvailable-=seats;
            String bookingId = "T" + bookingCounter;
            Passenger passenger = new Passenger(bookingId, name, age, seats);
            bookings.put(bookingId,passenger);
            return bookingId;

        }
        else {
            System.out.println("Booking failed.Not enough seats vailable");
            return null;
        }
    }

    public boolean cancelTicket(String bookingId){
        Passenger passenger = bookings.get(bookingId);
        if(passenger!=null){
            int seat = passenger.getSeatsBooked();
            ticketPrice-=200*seat;
            seatsAvailable+=seat;
            bookings.remove(bookingId);
            System.out.println("Booking Cancelled.Your refund amount for seats " + seat + "is completed successfully");
            return true;
        }else{
            System.out.println("Invalid bookingId");
            return false;
        }
    }

    public void displayDetails(){
        System.out.println("Flight Name " + flightName);
        System.out.println("Seats Available : " + seatsAvailable);
        System.out.println("Ticket Price : " + ticketPrice);
    }

    public void printDetails(){
        System.out.println("Flight Name " + flightName);
        System.out.println("Seats Available : " + seatsAvailable);
        System.out.println("Ticket Price : " + ticketPrice);
        System.out.println("Passenger : ");
        for(Passenger passenger : bookings.values()){
            System.out.println(passenger);
        }
    }

}
