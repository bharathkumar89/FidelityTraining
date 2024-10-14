class Vehicle {
    String registrationNumber;
    String brand;

    Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public double calculateParkingFee() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber + ", Brand: " + brand);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee() {
        return 50;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors + ", Parking Fee: ₹" + calculateParkingFee());
    }
}

class Motorcycle extends Vehicle {
    String engineType;

    Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee() {
        return 30;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + engineType + ", Parking Fee: ₹" + calculateParkingFee());
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Car car = new Car("KA-01-AB-1234", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("KA-05-CD-5678", "Yamaha", "Petrol");

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();
    }
}
