import java.util.*;

class LEETCODE771 {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : jewels.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        int c = 0;
        for(char ch : stones.toCharArray()){
            if(map.containsKey(ch)) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        LEETCODE771 obj = new LEETCODE771();
        
        String jewels = "aA";
        String stones = "aAAbbbb";
        
        int result = obj.numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
}