import java.util.Scanner;

abstract class Vehicle {

    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

class Practical30 {

    public static void main(String[] args) {

        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle:");
        System.out.println("1. Car");
        System.out.println("2. Bike");

        int choice = sc.nextInt();

        Vehicle v;

        if(choice == 1) {
            v = new Car();
        }
        else if(choice == 2) {
            v = new Bike();
        }
        else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Fuel Type: " + v.fuelType());
        System.out.println("Number of Wheels: " + v.noOfWheels());
    }
}