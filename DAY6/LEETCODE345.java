public class LEETCODE345 {

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        while (l < r) {
            while (l < r && !isVowel(ch[l])) {
                l++;
            }
            while (l < r && !isVowel(ch[r])) {
                r--;
            }

            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

            l++;
            r--;
        }

        return new String(ch);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        LEETCODE345 solution = new LEETCODE345();

        String s1 = "hello";
        System.out.println(solution.reverseVowels(s1));

        String s2 = "leetcode";
        System.out.println(solution.reverseVowels(s2));
    }
}