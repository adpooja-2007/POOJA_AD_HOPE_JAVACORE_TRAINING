public class LEETCODE58 {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        LEETCODE58 solution = new LEETCODE58();

        String s1 = "Hello World";
        System.out.println(solution.lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s3));
    }
}