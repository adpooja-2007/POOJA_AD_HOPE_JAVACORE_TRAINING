class LEETCODE390 {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int rem = n;
        boolean leftToRight = true;

        while (rem > 1) {
            if (leftToRight || rem % 2 == 1) {
                head += step;
            }
            rem /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }

    public static void main(String[] args) {
        LEETCODE390 sol = new LEETCODE390();

        System.out.println(sol.lastRemaining(9));
        System.out.println(sol.lastRemaining(1));
        System.out.println(sol.lastRemaining(10));
    }
}