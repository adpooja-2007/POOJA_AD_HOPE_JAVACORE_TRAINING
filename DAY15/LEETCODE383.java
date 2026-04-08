import java.util.*;

public class LEETCODE383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!(map.containsKey(ch)) || map.get(ch) == 0) return false;
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        LEETCODE383 obj = new LEETCODE383();

        String ransomNote1 = "a";
        String magazine1 = "b";

        String ransomNote2 = "aa";
        String magazine2 = "aab";

        System.out.println(obj.canConstruct(ransomNote1, magazine1));
        System.out.println(obj.canConstruct(ransomNote2, magazine2));
    }
}