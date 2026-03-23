public class LEETCODE125 {

    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String s2 = "";

        for (char ch : s1.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                s2 = s2 + ch;
            }
        }

        StringBuilder s3 = new StringBuilder(s2);
        s3.reverse();

        if (s2.equals(s3.toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LEETCODE125 obj = new LEETCODE125();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println("Is palindrome: " + result);
    }
}