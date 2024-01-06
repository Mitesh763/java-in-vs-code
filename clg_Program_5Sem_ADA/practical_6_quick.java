package clg_Program_5Sem_ADA;

import java.util.Random;

public class practical_6_quick {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(5000);
        int[] ascendingArray = generateAscendingArray(5000);
        int[] descendingArray = generateDescendingArray(5000);

        long randomStartTime = System.nanoTime();
        quickSort(randomArray, 0, randomArray.length - 1);
        long randomEndTime = System.nanoTime();
        long randomDuration = randomEndTime - randomStartTime;

        long ascendingStartTime = System.nanoTime();
        quickSort(ascendingArray, 0, ascendingArray.length - 1);
        long ascendingEndTime = System.nanoTime();
        long ascendingDuration = ascendingEndTime - ascendingStartTime;

        long descendingStartTime = System.nanoTime();
        quickSort(descendingArray, 0, descendingArray.length - 1);
        long descendingEndTime = System.nanoTime();
        long descendingDuration = descendingEndTime - descendingStartTime;

        System.out.println("Numbers of inputes : " + randomArray.length);
        System.out.println("Random Order Sort Time: " + randomDuration + " nanoseconds");
        System.out.println("Ascending Order Sort Time: " + ascendingDuration + " nanoseconds");
        System.out.println("Descending Order Sort Time: " + descendingDuration + " nanoseconds");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        Random random = new Random();
        int pos = random.nextInt(low, high);
        int pivot = arr[pos];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // Adjust the range as needed
        }
        return arr;
    }

    public static int[] generateAscendingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] generateDescendingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }
}
