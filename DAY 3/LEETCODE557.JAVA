public class LEETCODE557 {

    public String reverseWords(String s) {
        String[] parts = s.split(" ");

        for (int i = 0; i < parts.length; i++) {
            char[] arr = parts[i].toCharArray();
            int l = 0, r = arr.length - 1;

            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            parts[i] = new String(arr);
        }

        return String.join(" ", parts);
    }

    public static void main(String[] args) {
        LEETCODE557 obj = new LEETCODE557();

        String s = "Let's take LeetCode contest";

        String result = obj.reverseWords(s);

        System.out.println("Reversed words: " + result);
    }
}