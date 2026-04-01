package DAY11;
import java.util.*;
public class LEETCODE167 {
    public static int[] twoSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (arr[l] + arr[r] != target) {
            if (arr[l] + arr[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{l + 1, r + 1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}