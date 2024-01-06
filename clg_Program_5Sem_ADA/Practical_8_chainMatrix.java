package clg_Program_5Sem_ADA;

import java.util.Scanner;

public class Practical_8_chainMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of matrix which you want to maltiplication :");
        int n = sc.nextInt();// number of matrix

        // sequence of matrix which is n+1
        int[] p = new int[n + 1];
        System.out.println("Enter sequence of matrix: ");
        for (int i = 0; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        // print sequence of matrix which is n+1
        System.out.println("Your matricex are: ");
        for (int i = 0; i < n; i++) {
            System.out.println("A" + (i + 1) + ":[" + p[i] + " X " + p[i + 1] + "] ");
        }

        // m store minimum values of matric
        int[][] m = new int[n + 1][n + 1];

        // s store minimum k value of matrix m
        int[][] s = new int[n + 1][n + 1];

        // value add in m and s matrices
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }
        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + (p[i - 1] * p[k] * p[j]);
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        System.out.println();

        // print value add in m and s matrices
        for (int l = n; l >= 2; l--) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k <= j - l + 1; k++) {
                    System.out.print("m[" + i + "][" + j + "] : " + m[i][j] + " " + "s[" + i + "][" + j + "] : "
                            + s[i][j] + " ");
                    // System.out.print("m: " + m[i][j] + " " + "s: " + s[i][j] + " ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out
                    .print("m[" + i + "][" + i + "] : " + m[i][i] + " " + "s[" + i + "][" + i + "] : " + s[i][i] + " ");
            // System.out.print("m: " + m[i][i] + " " + "s: " + s[i][i] + " ");
        }
        System.out.println();

        // find sequence:
        System.out.print("Sequence of multiplication of matrices: ");
        for (int l = n; l >= 2; l--) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                optimal_parent(s, i, j);
                break;
            }
            break;
        }
    }

    public static void optimal_parent(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            optimal_parent(s, i, s[i][j]);
            optimal_parent(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }
}
