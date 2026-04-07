import java.util.HashSet;
import java.util.Set;

public class LEETCODE268 {

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!(set.contains(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LEETCODE268 obj = new LEETCODE268();

        int[] nums1 = {3, 0, 1};      // missing = 2
        int[] nums2 = {0, 1};         // missing = 2
        int[] nums3 = {9,6,4,2,3,5,7,0,1}; // missing = 8

        System.out.println("Test Case 1: " + obj.missingNumber(nums1));
        System.out.println("Test Case 2: " + obj.missingNumber(nums2));
        System.out.println("Test Case 3: " + obj.missingNumber(nums3));
    }
}