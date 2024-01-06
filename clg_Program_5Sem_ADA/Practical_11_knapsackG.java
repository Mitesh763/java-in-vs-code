package clg_Program_5Sem_ADA;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Practical_11_knapsackG {
    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i]);
        }
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                double ratio1 = (double) item1.value / item1.weight;
                double ratio2 = (double) item2.value / item2.weight;
                return Double.compare(ratio2, ratio1);
            }
        });

        double totalValue = 0.0;
        int remainingCapacity = capacity;
        for (Item item : items) {
            if (remainingCapacity >= item.weight) {
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                double fraction = (double) remainingCapacity / item.weight;
                totalValue += fraction * item.value;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = { 60, 100, 120 };
        int[] weights = { 10, 20, 30 };
        int capacity = 50;
        double maxValue = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum weight that can be obtained: " + maxValue);
    }
}
