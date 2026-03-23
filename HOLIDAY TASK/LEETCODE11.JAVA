public class LEETCODE11 {

    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int wid = j - i;
            int area = wid * Math.min(height[i], height[j]);
            max = Math.max(max, area);

            if (height[i] < height[j])
                i++;
            else
                j--;
        }

        return max;
    }

    public static void main(String[] args) {
        LEETCODE11 obj = new LEETCODE11();

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = obj.maxArea(height);

        System.out.println("Maximum water area: " + result);
    }
}