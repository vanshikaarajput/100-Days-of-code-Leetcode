// Day 5
// LeetCode 1833 - Maximum Ice Cream Bars
// Date: 21.06.2026
import java.util.Arrays;

class Day5 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;

        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}