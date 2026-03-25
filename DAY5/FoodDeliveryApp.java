class User {
    String name;
    String phone;
    String address;

    User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}

class FoodUser extends User {
    String favFood;

    FoodUser(String name, String phone, String address, String favFood) {
        super(name, phone, address);
        this.favFood = favFood;
    }

    void orderFood() {
        System.out.println("\n--- Food Order ---");
        super.displayUser();
        System.out.println("Favorite Food: " + favFood);
        System.out.println("Order placed successfully!");
    }
}

class TravelUser extends User {
    String prefVehicle;

    TravelUser(String name, String phone, String address, String prefVehicle) {
        super(name, phone, address);
        this.prefVehicle = prefVehicle;
    }

    void bookDelivery() {
        System.out.println("\n--- Shopping Delivery ---");
        super.displayUser();
        System.out.println("Preferred Vehicle: " + prefVehicle);
        System.out.println("Item will be delivered soon!");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {

        FoodUser f1 = new FoodUser(
                "Pooja",
                "9876543210",
                "Chennai",
                "Pizza"
        );

        f1.orderFood();

        TravelUser t1 = new TravelUser(
                "Rahul",
                "9123456780",
                "Bangalore",
                "Bike"
        );

        t1.bookDelivery();
    }
}