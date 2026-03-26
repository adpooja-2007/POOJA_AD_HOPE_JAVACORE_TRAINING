class LEETCODE520 {

    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) return true;
        if (word.equals(word.toLowerCase())) return true;
        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        LEETCODE520 obj = new LEETCODE520();

        String word1 = "USA";
        String word2 = "leetcode";
        String word3 = "Google";
        String word4 = "FlaG";

        System.out.println(word1 + " -> " + obj.detectCapitalUse(word1)); // true
        System.out.println(word2 + " -> " + obj.detectCapitalUse(word2)); // true
        System.out.println(word3 + " -> " + obj.detectCapitalUse(word3)); // true
        System.out.println(word4 + " -> " + obj.detectCapitalUse(word4)); // false
    }
}