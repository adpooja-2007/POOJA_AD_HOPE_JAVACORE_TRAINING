import java.util.*;

public class LEETCODE3740 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.minimumDistance(nums);

        System.out.println(result);
    }
}

class Solution {
    public int minimumDistance(int[] nums) {
        int dis = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int curr = Math.abs(i - j) + Math.abs(j - k) + Math.abs(i - k);
                        dis = Math.min(dis, curr);
                    }
                }
            }
        }

        return dis == Integer.MAX_VALUE ? -1 : dis;
    }
}