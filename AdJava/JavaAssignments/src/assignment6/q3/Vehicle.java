package assignment6.q3;

import java.util.Scanner;

public class Vehicle {
    protected String vehicleNumber, brand;
    protected double rentPerDay;
    protected int days;

    Vehicle(String vehicleNumber, String brand, double rentPerDay, int days) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.days = days;
    }

    public double calculateRentalAmount() { return rentPerDay * days; }

    void displayDetails() {
        System.out.println("Vehicle number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per day: " + rentPerDay);
        System.out.println("Days: " + days);
        System.out.println("Rental amount: " + calculateRentalAmount());
    }

    static class Car extends Vehicle {
        private final int numberOfSeats;
        private final double insuranceCharge;

        Car(String number, String brand, double rent, int days, int seats, double insurance) {
            super(number, brand, rent, days);
            numberOfSeats = seats;
            insuranceCharge = insurance;
        }

        @Override public double calculateRentalAmount() {
            return super.calculateRentalAmount() + insuranceCharge;
        }

        @Override void displayDetails() {
            super.displayDetails();
            System.out.println("Number of seats: " + numberOfSeats);
            System.out.println("Insurance charge: " + insuranceCharge);
        }
    }

    static class Bike extends Vehicle {
        private final int helmetCount;
        private final double maintenanceCharge;

        Bike(String number, String brand, double rent, int days, int helmets, double maintenance) {
            super(number, brand, rent, days);
            helmetCount = helmets;
            maintenanceCharge = maintenance;
        }

        @Override public double calculateRentalAmount() {
            return super.calculateRentalAmount() + maintenanceCharge;
        }

        @Override void displayDetails() {
            super.displayDetails();
            System.out.println("Helmet count: " + helmetCount);
            System.out.println("Maintenance charge: " + maintenanceCharge);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rental days: ");
        int days = scanner.nextInt();
        Vehicle car = new Car("CAR101", "BMW", 1500, days, 5, 300);
        Vehicle bike = new Bike("BIKE101", "Royal Enfield", 800, days, 2, 100);
        System.out.println("\n--- Car Details ---");
        car.displayDetails();
        System.out.println("\n--- Bike Details ---");
        bike.displayDetails();
        scanner.close();
    }
}