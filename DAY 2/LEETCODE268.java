public class LEETCODE268 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        double tot = n * (n + 1) / 2.0;

        int sum = 0;
        int i = 0;

        while (n > 0) {
            sum += nums[i];
            i++;
            n--;
        }

        int total = (int) tot;
        return (total - sum);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {3, 0, 1};

        int result = obj.missingNumber(nums);

        System.out.println("Missing number: " + result);
    }
}