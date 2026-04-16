import java.util.*;

public class LEETCODE697 {

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int mxm = 0;
        for(int key : map.keySet()){
            mxm = Math.max(mxm, map.get(key));
        }

        int res = nums.length;

        for(int key : map.keySet()){
            if(map.get(key) == mxm){

                int first = -1, last = -1;

                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == key){
                        if(first == -1) first = i;
                        last = i;
                    }
                }

                res = Math.min(res, last - first + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        int result = findShortestSubArray(nums);

        System.out.println(result);
    }
}