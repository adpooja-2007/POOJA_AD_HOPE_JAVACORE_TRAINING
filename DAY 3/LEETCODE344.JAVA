public class LEETCODE344 {

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        LEETCODE244 obj = new LEETCODE244();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        obj.reverseString(s);

        System.out.print("Reversed string: ");
        for (char c : s) {
            System.out.print(c);
        }
    }
}