class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vNo, String b, String f) {
        vehicleNumber = vNo;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    int numberOfSeats;
    boolean ACavailable;

    Car(String vNo, String b, String f, int seats, boolean ac) {
        super(vNo, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {

    int batteryCapacity;
    int chargingTime;

    ElectricCar(String vNo, String b, String f, int seats, boolean ac, int battery, int time) {
        super(vNo, b, f, seats, ac);
        batteryCapacity = battery;
        chargingTime = time;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

class Vehicle25 {

    public static void main(String[] args) {

        Vehicle v = new Vehicle("GJ01AB1234", "Honda", "Petrol");
        Car c = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        ElectricCar e = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 2);

        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Vehicle Details:");
        v.displayDetails();

        System.out.println("\nCar Details:");
        c.displayDetails();

        System.out.println("\nElectric Car Details:");
        e.displayDetails();

        System.out.println("\nUpcasting Example:");
        Vehicle v1 = new Car("GJ04GH3456", "Maruti", "Petrol", 4, false);
        v1.displayDetails();

        System.out.println("\nDowncasting Example:");
        if (v1 instanceof Car) {
            Car c1 = (Car) v1;
            System.out.println("Accessing Car specific data:");
            System.out.println("Seats: " + c1.numberOfSeats);
        }
    }
}