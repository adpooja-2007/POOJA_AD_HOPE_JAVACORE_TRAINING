import java.util.*;
class AList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)%2==0)list.remove(i);
        }
            System.out.println(list);
    }
}