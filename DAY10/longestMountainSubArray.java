package DAY10;
import java.util.*;
class longestMountainSubArray {
    public int[] longestMountainSubArray(int[] arr) {
        int n = arr.length;
        int start = -1;
        int end = -1;
        int maxLen = 0;
        int i = 1;

        while (i < n - 1) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {

                int l = i;
                int r = i;

                while ((l > 0) && arr[l] > arr[l - 1])
                    l--;

                while ((r < n - 1) && arr[r] > arr[r + 1])
                    r++;

                int len = r - l + 1;

                if (len > maxLen) {
                    maxLen = len;
                    start = l;
                    end = r;
                }

                i = r;
            }
            i++;
        }

        if (maxLen == 0) {
            return new int[]{};
        }

        int[] nums = new int[maxLen];
        int k = 0;

        for (int j = start; j <= end; j++) {
            nums[k++] = arr[j];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 6, 5};
        longestMountainSubArray obj = new longestMountainSubArray();
        int[] res = obj.longestMountainSubArray(a);

        System.out.println(Arrays.toString(res));
    }
}