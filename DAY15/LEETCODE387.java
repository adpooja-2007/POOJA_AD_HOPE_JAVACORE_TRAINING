import java.util.*;

public class LEETCODE387 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LEETCODE387 obj = new LEETCODE387();

        String s = "leetcode"; // test case
        int result = obj.firstUniqChar(s);

        System.out.println("First unique character index: " + result);
    }
}