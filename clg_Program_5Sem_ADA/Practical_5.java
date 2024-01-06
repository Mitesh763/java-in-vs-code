package clg_Program_5Sem_ADA;

import java.util.Scanner;

public class Practical_5 {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(Scanner.in);
        System.out.print("Enter size of n: ");
        int n = scanner.nextInt();

        int s1 = 0;
        int s2 = 1;
        int s3;

        System.out.println("Fibonacci Using Iterator : ");
        if (n == 1) {
            System.out.println(s1);
        } else if (n == 2) {
            System.out.println(s1 + " " + s2);
        } else if (n > 2) {
            long start = System.nanoTime();
            System.out.print(s1 + " ");
            System.out.print(s2);
            for (int i = 1; i < n - 1; i++) {
                s3 = s1 + s2;
                System.out.print(" " + s3);
                s1 = s2;
                s2 = s3;
            }
            System.out.println();
            long end = System.nanoTime();
            System.out.print("Growth rate : " + (end - start) + " in nano second");

        }
        System.out.println();
        long start = System.nanoTime();
        System.out.println("Fibonachi series using recursive method : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci1(i) + " ");
        }
        long end = System.nanoTime();
        System.out.println();
        System.out.print("Growth rate : " + (end - start) + " in nano second");

    }

    public static int Fibonacci1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (Fibonacci1(n - 1) + Fibonacci1(n - 2));
        }
    }
}
