
package Recursion;

public class CoinChangeI {

    public static int solve(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        for (int coin : coins) {
            int recursionKaAns = solve(coins, amount - coin);

            if (recursionKaAns != Integer.MAX_VALUE) {
                int totalCoinUsed = recursionKaAns + 1;
                mini = Math.min(mini, totalCoinUsed);
            }
        }

        return mini;
    }

    public static int coinChange(int[] coins, int amount) {
        int ans = solve(coins, amount);

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }
}
