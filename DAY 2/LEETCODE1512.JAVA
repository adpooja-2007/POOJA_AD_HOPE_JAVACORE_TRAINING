public class LEETCODE1512 {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i < j)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LEETCODE1512 obj = new LEETCODE1512();

        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = obj.numIdenticalPairs(nums);

        System.out.println("Number of good pairs: " + result);
    }
}