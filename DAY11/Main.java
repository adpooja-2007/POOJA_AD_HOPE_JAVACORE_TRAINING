class ProductOutOfStockException extends Exception{
    public ProductOutOfStockException(String message){
        super(message);
    }
}
class PaymentFailedException extends Exception{
    public PaymentFailedException(String message){
        super(message);
    }
}
class OrderProcessingException extends Exception{
    public OrderProcessingException(String message){
        super(message);
    }
}
class Product{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product,User user,int quantity){
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService{
    public void placeOrder(Order order) throws ProductOutOfStockException,PaymentFailedException,OrderProcessingException{
        if(order.quantity>order.product.stock){
            throw new ProductOutOfStockException("Product is out of stock!");
        }
        if(Math.random()<0.3){
            throw new PaymentFailedException("Payment failed!");
        }
        if(Math.random()<0.2){
            throw new OrderProcessingException("Order processing failed!");
        }
        order.product.stock-=order.quantity;
        System.out.println("Order placed successfully for "+order.user.name);
        System.out.println("Remaining stock: "+order.product.stock);
    }
}
public class Ecommerce{
    public static void main(String[] args){
        Product product=new Product("Laptop",5,50000);
        User user=new User("Pooja","Chennai");
        Order order=new Order(product,user,2);
        OrderService service=new OrderService();
        try{
            service.placeOrder(order);
        }
        catch(ProductOutOfStockException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(PaymentFailedException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(OrderProcessingException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}