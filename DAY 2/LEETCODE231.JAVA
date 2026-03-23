public class LEETCODE231 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 16; // test value

        boolean result = obj.isPowerOfTwo(n);

        if (result) {
            System.out.println(n + " is a power of two");
        } else {
            System.out.println(n + " is NOT a power of two");
        }
    }
}