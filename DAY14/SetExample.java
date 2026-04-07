import java.util.*;
public class SetExample {
    public static void main(String[] args){
        Set<Integer> LinkedSet = new LinkedSet<>();
        Set<Integer> Hset = new HashSet<>();
        int[] arr = {5,3,9,1,7,2};
        for(int i : arr){
            LinkedSet.add(i);
            Hset.add(i);
        }
        System.out.println(LinkedSet);
        System.out.println(Hset);
    }
}