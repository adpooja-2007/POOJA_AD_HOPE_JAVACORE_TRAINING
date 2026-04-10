import java.util.*;

public class LeetCode451 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // take string input

        Solution sol = new Solution();
        String result = sol.frequencySort(input);

        System.out.println(result);
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}