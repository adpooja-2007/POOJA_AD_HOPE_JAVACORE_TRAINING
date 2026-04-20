import java.util.List;
public class StreamsExample2{
    public static void main(String[] args){
        List<Integer> nums = List.of(2,3,4,5,6);
        List<Integer> multiplyBy2 = nums.stream().map((i)->i*2).toList();
        System.out.println(multiplyBy2);
        List<Integer> evenNumbers = nums.stream().filter((i)->i%2==0).toList();
        System.out.println(evenNmumbers);
    }
}