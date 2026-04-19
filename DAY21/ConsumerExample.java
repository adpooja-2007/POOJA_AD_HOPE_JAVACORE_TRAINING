import java.util.*;
import java.util.function.*;

class Stud {
    String name;

    Stud(String name) {
        this.name = name;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> printString = s -> System.out.println(s);

        Consumer<Stud> printName = s -> System.out.println(s.name);

        printName.accept(new Stud("test1"));
        printString.accept("From Consumer");
        List<String> names=List.of("abc","def","ghi");
        names.forEach(name->System.out.println(name));
        
    }
}