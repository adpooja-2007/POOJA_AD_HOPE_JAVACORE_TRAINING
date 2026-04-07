import java.util.HashSet;
import java.util.Set;

public class LEETCODE217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        LEETCODE217 obj = new LEETCODE217();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println("Test Case 1: " + obj.containsDuplicate(nums1)); // false
        System.out.println("Test Case 2: " + obj.containsDuplicate(nums2)); // true
    }
}