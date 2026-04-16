import java.util.*;

public class LEETCODE350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i : nums1) arr1.add(i);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : nums2){
            if(arr1.contains(n)){
                arr.add(n); 
                arr1.remove(Integer.valueOf(n));
            }
        }

        int[] res = new int[arr.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = arr.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}