package assignment6.q2;

import java.util.Scanner;

public class TravelBooking {
    protected int bookingId;
    protected String passengerName, source, destination;
    protected double distance;

    TravelBooking(int bookingId, String passengerName, String source, String destination, double distance) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public double calculateFare() { return distance * 35; }

    void displayDetails() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Route: " + source + " to " + destination);
        System.out.println("Distance: " + distance + " km");
    }

    static class BusBooking extends TravelBooking {
        private final String busType;
        private final int seatNumber;

        BusBooking(int id, String name, String source, String destination, double distance,
                   String busType, int seatNumber) {
            super(id, name, source, destination, distance);
            this.busType = busType;
            this.seatNumber = seatNumber;
        }

        @Override public double calculateFare() {
            return distance * (busType.equalsIgnoreCase("Sleeper") ? 3 : 2);
        }

        @Override void displayDetails() {
            super.displayDetails();
            System.out.println("Bus type: " + busType);
            System.out.println("Seat number: " + seatNumber);
        }
    }

    static class TrainBooking extends TravelBooking {
        private final int trainNumber;
        private final String coachType;

        TrainBooking(int id, String name, String source, String destination, double distance,
                     int trainNumber, String coachType) {
            super(id, name, source, destination, distance);
            this.trainNumber = trainNumber;
            this.coachType = coachType;
        }

        @Override public double calculateFare() {
            if (coachType.equalsIgnoreCase("3A")) return distance * 10;
            if (coachType.equalsIgnoreCase("2A")) return distance * 7;
            if (coachType.equalsIgnoreCase("Sleeper")) return distance * 3;
            return distance * 2;
        }

        @Override void displayDetails() {
            super.displayDetails();
            System.out.println("Train number: " + trainNumber);
            System.out.println("Coach type: " + coachType);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter source: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter distance in km: ");
        double distance = scanner.nextDouble();

        TravelBooking bus = new BusBooking(101, name, source, destination, distance, "Sleeper", 14);
        TravelBooking train = new TrainBooking(102, name, source, destination, distance, 2345, "2A");
        System.out.println("\n--- Bus Booking ---");
        bus.displayDetails();
        System.out.println("Fare: " + bus.calculateFare());
        System.out.println("\n--- Train Booking ---");
        train.displayDetails();
        System.out.println("Fare: " + train.calculateFare());
        scanner.close();
    }
}