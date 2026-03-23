import java.util.*;
class methods{
    public void add(int a,int b){
        System.out.printf("Sum : %d\n",(a+b));
    }
    public void sub(int a,int b){
        System.out.printf("Difference : %d\n",(a-b));
    }
    public void mult(int a,int b){
        System.out.printf("Product : %d\n",(a*b));
    }
    public void div(int a,int b){
        System.out.printf("Quotient : %d\n",(a/b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        methods m = new methods();
        m.add(a,b);
        m.sub(a,b);
        m.mult(a,b);
        m.div(a,b);
    }
}