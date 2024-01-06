
// NESTED TRY-CATCH EXCEPTION

import java.util.Scanner;

public class lec_82_nested_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 54;
        arr[1] = 4;
        arr[2] = 77;

        boolean bol = true;

        while (bol) {
            System.out.print("Enter index number which you want to Division :  ");
            int ind = sc.nextInt();
            System.out.print("Enter index 2 number which you want to Division :  ");
            int ind2 = sc.nextInt();

            try {
                System.out.println("WELCOME In GECM...!");
                System.out.println("elemet at " + ind2 + " is : " + arr[ind2]);
                try {
                    System.out.println("element at " + ind + " is : " + arr[ind]);
                    bol = false;
                } catch (Exception e) {
                    System.out.println("EXception occur..!");
                    System.out.println("LEVEL 2");
                }
            } catch (Exception e) {
                System.out.println("EXception occur..!");
                System.out.println("LEVEL 1");
            }
        }
        System.out.println("end of the this Program");
    }
}
