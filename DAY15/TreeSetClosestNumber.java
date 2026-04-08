import java.util.*;
public class TreeSetClosestNumber{
    public static void main(String[] args){
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(15);
        tree.add(20);
        tree.add(25);
        tree.add(27);
        tree.add(30);
        int target = 25;
        int ele = closest(tree,target);
        System.out.println(ele);
    }
    public static int closest(TreeSet<Integer>tree, int target ){
        Integer x = tree.lower(target);
        Integer y = tree.higher(target);
        int dif1 = Math.abs(x-target);
        int dif2 = Math.abs(y-target);
        return (dif1<=dif2)?x:y;
    }
}
