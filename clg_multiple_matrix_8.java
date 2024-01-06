
// MULTIPLICATION OF TWO MATRIX ::


import java.util.Scanner;

public class clg_multiple_matrix_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number of rows in materix m1 :");
        int row1 = sc.nextInt();
        System.out.println("Enter number of colomn in matrix 1 :");
        int col1 = sc.nextInt();

        int[][] m1 = new int[row1][col1];

        System.out.println("Enter element in 2D array of matrix M1 : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows in matrix 2 : ");
        int row2 = sc.nextInt();
        System.out.println("Enter number of clomn in matrix 2 : ");
        int col2 = sc.nextInt();

        int[][] m2 = new int[row2][col2];

        System.out.println();
        System.out.println("Enter element in 2D array of matrix M2 : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in M1 Matix is :");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("     " + m1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Elements in M2 Matix is :");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("     " + m2[i][j]);
            }
            System.out.println();
        }

        int[][] multi = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                multi[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    multi[i][j] = multi[i][j] + (m1[i][k] * m2[k][j]);
                }
            }
        }

        System.out.println();
        System.out.println("MUltiplication of Two Matrix m1 & m2 : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("   " + multi[i][j]);
            }
            System.out.println();
        }
    }
}