
// PROBLEM 14 : feet --> meter

import java.util.Scanner;

public class clg_prog_11_14_feet_meter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Mitesh R. Vaghela");
        System.out.println("");

        System.out.print("Enter Value in feet which you want to convert feet into meter : ");
        double val = sc.nextDouble();

        System.out.println("Converted into meter : " + val * 0.3048);
    }
}