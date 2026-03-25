public class LEETCODE2582 {

    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;
        if (t < n) {
            return t + 1;
        } else {
            return n - (t - (n - 1));
        }
    }

    public static void main(String[] args) {
        LEETCODE2582 solution = new LEETCODE2582();
        int n1 = 4, time1 = 5;
        System.out.println(solution.passThePillow(n1, time1));
        int n2 = 3, time2 = 2;
        System.out.println(solution.passThePillow(n2, time2));
    }
}