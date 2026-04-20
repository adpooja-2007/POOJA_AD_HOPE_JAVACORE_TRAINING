import java.util.function.Supplier;
import java.lang.Math;
public class SupplierExample{
    public static void main(String[] args){
        Supplier <Integer> s = ()->(int)(Math.random()*100);
        System.out.println(s.get());
    }
}