import java.util.*;

public class LEETCODE169 {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LEETCODE169 obj = new LEETCODE169();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element (nums1): " + obj.majorityElement(nums1));
        System.out.println("Majority Element (nums2): " + obj.majorityElement(nums2));
    }
}