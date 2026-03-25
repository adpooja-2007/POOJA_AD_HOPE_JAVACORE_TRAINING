class LEETCODE33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target)
                return mid;
            if (nums[l] <= nums[mid]) {

                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            } 
            else {

                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = obj.search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}