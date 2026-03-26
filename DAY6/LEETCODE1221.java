public class LEETCODE1221 {

    public int balancedStringSplit(String s) {
        int r = 0, l = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l) {
                c++;
                r = 0;
                l = 0;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        LEETCODE1221 solution = new LEETCODE1221();

        String s1 = "RLRRLLRLRL";
        System.out.println(solution.balancedStringSplit(s1));

        String s2 = "RLLLLRRRLR";
        System.out.println(solution.balancedStringSplit(s2));

        String s3 = "LLLLRRRR";
        System.out.println(solution.balancedStringSplit(s3));
    }
}