package clg_Program_5Sem_ADA;

import java.util.*;
public class Practical_7_makingChange {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Amount which you want to change: ");
          int P = sc.nextInt();

          System.out.print("Enter number of Denomenators: ");
          int k = sc.nextInt();
          int[] c = new int[P + 1];
          int[] s = new int[P + 1];
          int[] d = new int[k];

          System.out.println("Enter Denomenators: ");
          for (int i = 0; i < k; i++) {
               d[i] = sc.nextInt();
          }
          System.out.print("Denomenators is:: ");
          for (int i = 0; i < k; i++) {
               System.out.print("d" + i + ": " + d[i] + "   ");
          }
          System.out.println();

          c[0] = 0;
          s[0] = 0;
          int coin = 0;

          for (int i = 1; i <= P; i++) {
               Integer min = Integer.MAX_VALUE;
               for (int j = 0; j < k; j++) {
                    if (d[j] <= i) {
                         if (1 + c[i - d[j]] < min) {
                              min = (1 + c[i - d[j]]);
                              coin = j;
                         }
                    }
               }
               c[i] = min;
               s[i] = coin;
          }
          for (int i = 1; i <= P; i++) {
               System.out.print("c" + i + ": " + c[i] + "   ");
               System.out.print("s" + i + ": " + s[i] + "   ");
               System.out.println();
          }

          byte temp = 0;
          while (P > 0) {
               temp++;
               System.out.println("s" + P + ": " + s[P] + " ");
               if (temp > 0)
                    System.out.println("Your " + temp + " coin is: " + d[s[P]]);
               P = P - d[s[P]];
          }
     }
}