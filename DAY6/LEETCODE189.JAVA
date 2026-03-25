public class LEETCODE189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        LEETCODE189 solution = new LEETCODE189();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }