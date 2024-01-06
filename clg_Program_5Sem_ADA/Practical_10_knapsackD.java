package clg_Program_5Sem_ADA;

public class Practical_10_knapsackD {
    public static int knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] t = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    t[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    t[i][w] = Math.max(values[i - 1] + t[i - 1][w - weights[i - 1]], t[i - 1][w]);
                } else {
                    t[i][w] = t[i - 1][w];
                }
            }
        }
        return t[n][capacity];
    }

    public static void main(String[] args) {
        int[] values = { 60, 100, 120 };
        int[] weights = { 10, 20, 30 };
        int capacity = 50;
        int maxValue = knapsack(values, weights, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}