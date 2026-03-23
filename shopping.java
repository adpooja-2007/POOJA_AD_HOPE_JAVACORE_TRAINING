public class shopping{
    int id ;
    String name;
    double price;
    int qty;
    shopping(int i, String n, double p, int q ){
        this.id = i;
        this.name = n;
        this.price = p;
        this.qty = q;
        getTotalPrice(price,qty);
    }
    void getTotalPrice(double price, int qty){
        double tot = price*qty;
        System.out.printf("Id: %d Product: %s Price : %.2f Quantity : %d Total : %.2f\n",id, name, price, qty,tot);
    }
    public static void main(String[] args){
        shopping s1 = new shopping(1,"pen",10.0,5);
        shopping s2 = new shopping(2,"pencil",5.0,5);
        shopping s3 = new shopping(3, "ball",25,1);
    }
}