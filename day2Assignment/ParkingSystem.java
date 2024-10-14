package com.Assignment2;

class Vehicle {
    protected String registrationNumber;
    protected String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }

    public double calculateParkingFee(int hours) {
        return 0.0;
    }
}

class Car extends Vehicle {
    private int numDoors;


    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * 2.0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private String engineType;


    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee(int hours) {
        return hours * 1.0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("XYZ456", "Harley Davidson", "V-twin");

        int carParkingHours = 5;
        int motorcycleParkingHours = 3;

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", carParkingHours, car.calculateParkingFee(carParkingHours));
        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", motorcycleParkingHours, motorcycle.calculateParkingFee(motorcycleParkingHours));
    }
}
