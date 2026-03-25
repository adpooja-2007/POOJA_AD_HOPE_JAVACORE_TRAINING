class User {
    String name;
    String phone;
    String location;

    User(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Location: " + location);
    }
}

class RideUser extends User {
    String vehicleType;
    String rideType;

    RideUser(String name, String phone, String location, String vehicleType, String rideType) {
        super(name, phone, location);
        this.vehicleType = vehicleType;
        this.rideType = rideType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Ride Type: " + rideType);
    }
}

class FoodUser extends User {
    String favFood;

    FoodUser(String name, String phone, String location, String favFood) {
        super(name, phone, location);
        this.favFood = favFood;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Favorite Food: " + favFood);
    }
}

class ParcelUser extends User {
    double parcelWeight;

    ParcelUser(String name, String phone, String location, double parcelWeight) {
        super(name, phone, location);
        this.parcelWeight = parcelWeight;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Parcel Weight: " + parcelWeight + " kg");
    }
}

public class MultiBookingPlatform {
    public static void main(String[] args) {
        RideUser rideUser = new RideUser("Alice", "1234567890", "Chennai", "Car", "Premium");
        FoodUser foodUser = new FoodUser("Bob", "9876543210", "Bangalore", "Pizza");
        ParcelUser parcelUser = new ParcelUser("Charlie", "1122334455", "Delhi", 5.5);

        System.out.println("=== Ride Booking ===");
        rideUser.displayInfo();

        System.out.println("\n=== Food Delivery ===");
        foodUser.displayInfo();

        System.out.println("\n=== Parcel Delivery ===");
        parcelUser.displayInfo();
    }
}