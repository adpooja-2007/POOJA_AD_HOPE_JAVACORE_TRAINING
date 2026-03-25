public class LEETCODE1672 {

    public int maximumWealth(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int maxofrow = 0;

            for (int j = 0; j < n; j++) {
                maxofrow += arr[i][j];
            }

            if (maxofrow > max) {
                max = maxofrow;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[][] arr = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };

        int result = obj.maximumWealth(arr);

        System.out.println("Maximum Wealth: " + result);
    }
}