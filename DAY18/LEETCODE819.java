import java.util.*;

class LEETCODE819 {
    public String mostCommonWord(String paragh, String[] banned) {
        String para = paragh.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = para.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        for(String str : words){
            if (str.length() == 0 || bannedSet.contains(str)) continue;
            map.put(str,map.getOrDefault(str,0)+1);
        }
        
        String s = "";
        int maxm = 0;
        
        for (String key : map.keySet()) {
            if (map.get(key) > maxm) {
                maxm = map.get(key);
                s = key;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        LEETCODE819 obj = new LEETCODE819();
        
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        
        String result = obj.mostCommonWord(paragraph, banned);
        System.out.println(result);
    }
}