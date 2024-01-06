package clg_Program_5Sem_ADA;

import java.util.Arrays;

public class Practical_12_making_greedy {

    public static void main(String[] args) {
        int[] coins = { 1, 5, 10, 25 }; // Coin denominations in cents
        int amount = 63; // The amount for which we want to make change

        int[] change = makeChange(coins, amount);

        if (change != null) {
            System.out.println("Minimum number of coins to make change for " + amount + " cents: " + change[amount]);
            System.out.println("Coin denominations used:");
            printCoinsUsed(coins, change, amount);
        } else {
            System.out
                    .println("It's not possible to make change for " + amount + " cents with the given denominations.");
        }
    }

    public static int[] makeChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        minCoins[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (minCoins[i - coin] != Integer.MAX_VALUE && minCoins[i - coin] + 1 < minCoins[i]) {
                    minCoins[i] = minCoins[i - coin] + 1;
                }
            }
        }

        if (minCoins[amount] == Integer.MAX_VALUE) {
            return null; // It's not possible to make change for the given amount
        }

        return minCoins;
    }

    public static void printCoinsUsed(int[] coins, int[] change, int amount) {
        while (amount > 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                if (amount >= coins[i] && change[amount] == change[amount - coins[i]] + 1) {
                    System.out.println(coins[i] + " cents");
                    amount -= coins[i];
                    break;
                }
            }
        }
    }
}
