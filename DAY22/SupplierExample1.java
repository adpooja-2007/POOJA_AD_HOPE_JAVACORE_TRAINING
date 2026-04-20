import java.util.function.Supplier;
import java.lang.Math;
class Person{
    String name = "Supplier";
}
public class SupplierExample1{
    public static void main(String[] args){
        Supplier<Person> p = ()-> new Person();
        System.err.println(p.get().name);
    }
}