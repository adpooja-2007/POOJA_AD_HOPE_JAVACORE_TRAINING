public class LEETCODE3232 {

    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                sum1 += nums[i];
            }
            if (nums[i] >= 10) {
                sum2 += nums[i];
            }
        }
        return sum1 != sum2;
    }

    public static void main(String[] args) {
        LEETCODE3232 solution = new LEETCODE3232();

        int[] nums1 = {1, 20, 5, 15};
        System.out.println(solution.canAliceWin(nums1)); 
        int[] nums2 = {5, 5, 10, 10};
        System.out.println(solution.canAliceWin(nums2));  
    }
