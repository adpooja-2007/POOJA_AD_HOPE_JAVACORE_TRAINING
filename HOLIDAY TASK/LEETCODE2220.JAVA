public class LEETCODE2220 {

    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public static void main(String[] args) {
        LEETCODE2220 obj = new LEETCODE2220();

        int start = 10; 
        int goal = 7;   

        int result = obj.minBitFlips(start, goal);

        System.out.println("Minimum bit flips required: " + result);
    }
}