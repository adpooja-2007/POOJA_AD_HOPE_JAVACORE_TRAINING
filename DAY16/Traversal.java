import java.util.*;
public class Traversal{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int current = it.next();
            System.out.println(current);
        }
    }
}