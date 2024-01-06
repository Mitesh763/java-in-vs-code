
//CREATE ARRAY, CALCULATE AND FIND AVERAGE OF ELEMENTS ::

import java.util.Scanner;

public class clg_prog_arra_7_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        int[] arr2 = { 96, 92, 95, 99 };

        int sum = 0;
        float len = arr2.length;
        float avg = 0;

        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        System.out.println("Average of given array's elements is : " + sum / len);
    }
}
