package org.example;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightReservation system = new FlightReservation();
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("\n----Flight Reservation System----");
                System.out.println("1.Book tickets");
                System.out.println("2.Cancel tickets");
                System.out.println("3.Print flight details");
                System.out.println("4.Exit ");
                System.out.println("Enter Your Choice : ");

                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 1:
                        System.out.println("Enter your choice and flight name: Kingfisher / Indigo / SpiceJet / AirAsia / Vistara / GoFirst / Air India / Emirates / Qatar Airways / Lufthansa");
                        String flightName = scanner.nextLine();
                        if(system.flight.containsKey(flightName)){
                            system.displayDetails(flightName);
                            System.out.println("Enter the Passenger name");
                            String name = scanner.nextLine();
                            System.out.println("Enter age");
                            int age = scanner.nextInt();
                            System.out.println("Enter the number of seats to book tickets");
                            int seats = scanner.nextInt();
                            String bookingId = system.bookTickets(flightName,name,age,seats);
                            if(bookingId!=null){
                                System.out.println("Booking Successfull.Your booking ID is : " + bookingId);
                            }
                            else{
                                System.out.println("Invalid flight Name.Please try again");
                            }

                        }
                        break;
                    case 2: //cancel ticket
                        System.out.println("Enter your choice and flight name: Kingfisher / Indigo / SpiceJet / AirAsia / Vistara / GoFirst / Air India / Emirates / Qatar Airways / Lufthansa");
                        flightName = scanner.nextLine();
                        System.out.println("Enter Your Booking ID");
                        String bookingId = scanner.nextLine();
                        system.cancelTicket(flightName,bookingId);
                        System.out.println("Cancellation Successful");
                        break;
                    case 3:
                        System.out.println("Enter your choice and flight name: Kingfisher / Indigo / SpiceJet / AirAsia / Vistara / GoFirst / Air India / Emirates / Qatar Airways / Lufthansa");
                        flightName = scanner.nextLine();
                        system.printDetails(flightName);
                        break;
                    case 4:
                        System.out.println("Exiting system.Thank You");
                        scanner.close();
                        return;



                }

            }
        }
    }
