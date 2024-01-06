
// HANDLING SPECIFIC EXCEPTIONS

import java.io.IOException;
import java.util.Scanner;

public class lec_81_handling_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 54;
        arr[1] = 4;
        arr[2] = 77;

        System.out.print("Enter index number which you want to Division :  ");
        int ind = sc.nextInt();

        System.out.print("enter number which is divider :  ");
        int num = sc.nextInt();

        try {
            System.out.println("Element of given index : " + arr[ind]);
            System.out.println("Division of given index and number : " + arr[ind] / num);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurs here... : ");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurs here... : ");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception occurs here... : ");
            System.out.println(e);
        }
        // catch(IOException e ){
        //     System.out.println("Exception occurs here... : ");
        //     System.out.println(e);
        // }
    }
}
