public class LEETCODE191 {

    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        LEETCODE191 obj = new LEETCODE191();

        int n = 11; // binary: 1011

        int result = obj.hammingWeight(n);

        System.out.println("Number of 1 bits: " + result);
    }
}