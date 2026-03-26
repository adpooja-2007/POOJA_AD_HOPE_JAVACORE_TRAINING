class LEETCODE796 {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        LEETCODE796 obj = new LEETCODE796();

        String s = "abcde";
        String goal = "cdeab";

        boolean result = obj.rotateString(s, goal);

        System.out.println("String s: " + s);
        System.out.println("Goal: " + goal);
        System.out.println("Is rotation: " + result);
    }
}