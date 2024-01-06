import java.util.Scanner;

class ArrayboundException extends Exception {
    @Override
    public String toString() {
        return "Invalid Index cann't be accept";
    }
}

public class practice_set_14 {

    // public static int Array(int i) throws ArrayIndexOutOfBoundsException{
    //     if (i>=5) {
    //         // throw new ArrayIndexOutOfBoundsException();
    //     }
    //     return 0;
    // }
    public static void main(String[] args) {

        // PROBLEM 1:

        // Syntax Error :

        // ---
        // int a // semicolomn ..
        // b=9; //variable not found..
        // ---

        // Logical Error :

        // ---
        // System.out.println("table of 5 : ");
        // int a =5 ;
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(a + " * " + i + " = " + a+i); // between a & i --> *
        // }
        // ---

        // Runtime Error

        // ---
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // byte a = sc.nextByte();
        // ---

        // PROBLEM 2 :

        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("HaHa");
        }

        // PROBLEM 3:

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 54;
        arr[1] = 4;
        arr[2] = 77;
        boolean bol = true;
        int i = 0;
        System.out.print("Enter index numbe :  ");
                int ind = sc.nextInt();

        while (bol && i < 5) {
            try {
                
                System.out.println("Element at entered index is : " + arr[ind]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index ...!");
                i++;
            }
            
            if (i >= 5) {
                throw new ArrayIndexOutOfBoundsException();
                // Array(ind);
            }
        }
    }
}
