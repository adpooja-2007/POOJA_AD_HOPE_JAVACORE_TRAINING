import java.util.List;
public class StreamsExample{
    public static void main(String[] args){
        List<Integer> numbs = List.of(2,3,4,5,6);
        List<Integer> multiplyBy2 = numbs.stream().map((i)->i*2).toList();
        System.out.println(multiplyBy2);
        
    }
}