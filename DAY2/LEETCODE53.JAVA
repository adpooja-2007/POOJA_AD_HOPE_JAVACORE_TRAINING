public class LEETCODE53 {

    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i <= nums.length - 1; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}