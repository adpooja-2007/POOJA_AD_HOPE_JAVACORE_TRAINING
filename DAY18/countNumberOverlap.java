import java.util.*;
public class countNumberOverlap {
    public static void main(String[] args) {
        int points[][] = {{1,2},{7,8},{2,6},{9,12}};
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < points.length; i++){
            arr.add(new ArrayList<>(Arrays.asList(points[i][0], points[i][1])));
        }
        
        Collections.sort(arr, (a, b) -> (a.get(1) - b.get(1)));
        
        int count = 0;
        
        for(int i = 0; i < arr.size() - 1; i++){
            int ele1 = arr.get(i).get(1);
            int ele2 = arr.get(i + 1).get(1);
            
            if(ele1 <= ele2){
                count++;
                i++;
            }
        }
        
        System.out.println(count);
    }
}