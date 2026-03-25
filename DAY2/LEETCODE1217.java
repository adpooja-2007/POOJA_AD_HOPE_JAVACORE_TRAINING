public class LEETCODE1217{
    public int minCostToMoveChips(int[] position) {
        int[] count = new int[2];

        for (int i = 0; i < position.length; i++) {
            ++count[position[i] % 2];
        }

        return Math.min(count[0], count[1]);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] position = {1, 2, 3};

        int result = obj.minCostToMoveChips(position);

        System.out.println("Minimum cost to move chips: " + result);
    }
}