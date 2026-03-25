public class LEETCODE1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        LEETCODE1470 solution = new LEETCODE1470();

        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] res1 = solution.shuffle(nums1, n1);
        for (int num : res1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] res2 = solution.shuffle(nums2, n2);
        for (int num : res2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}