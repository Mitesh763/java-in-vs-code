
/**
 * @auther mitesh
 */
package folder.folder1.folder2;

import java.util.Scanner;

class Calculator {
    protected int x = 9;
    int y = 10;

    /**
     * @param a
     * @param b
     */
    public void sum(int a, int b) {
        System.out.println("sum is : " + a + b);
    }
}

class ScCalculator {
    public void sin(int a, int b) {
        System.out.println("Sin of numbers : " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void Hybrid(int a, int b) {
        System.out.println("sum : " + a + b);
        System.out.println("Sin : " + Math.sin(a + b));
    }
}

public class prectice_set_12_lec_67 {
    public static void main(String[] args) {
        System.out.println("I am main method ...!");

        // ScCalculator sc = new ScCalculator();
        // sc.sin(7, 85);

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter any number : ");
        byte a = sc1.nextByte();
        System.out.println("you enetred : " + a);
    }
}
