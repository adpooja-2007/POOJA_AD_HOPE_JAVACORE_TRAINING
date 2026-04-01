package DAY11;
import java.util.*;
public class LEETCODE134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];
        for(int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println(canCompleteCircuit(gas, cost));
    }
}