public class LEETCODE1781 {

    public int beautySum(String s) {
        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                total += (max - min);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        LEETCODE1781 obj = new LEETCODE1781();

        String s = "aabcb";

        int result = obj.beautySum(s);

        System.out.println("Total beauty sum: " + result);
    }
}