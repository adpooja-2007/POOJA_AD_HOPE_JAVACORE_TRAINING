package src.com.ecommerce.model;
public class OrderService {
    public void placeOrder(Order ord) {
        double totalPrice = ord.product.price * ord.quantity;
        System.out.println("Username: " + ord.user.name);
        System.out.println("Product: " + ord.product.name);
        System.out.println("Quantity: " + ord.quantity);
        System.out.println("Total Price: " + totalPrice);
    }
}