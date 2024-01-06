
import java.util.Scanner;

public class lec_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //if-else ladder
        // System.out.print("Enter your age:  ");
        // Scanner sc = new Scanner(System.in);
        // int age =sc.nextInt();

        // if (age>56) {
        //     System.out.println("You have experianced!");
        // }
        // else if(age>46){
        //     System.out.println("You have semi-exprianced!");
        // }
        // else if(age>36){
        //     System.out.println("You have semi-semi-experianced!");
        // }
        // else{
        //     System.out.println("You havn't experience");
        // }


        //switch case
        System.out.print("Enter your choice : ");
        int a=sc.nextInt();

        switch (a) {
            case 0:
                System.out.println("you inputed " + a + " that means you are great! ");
                break;

            case 1:
                System.out.println("you inputed " + a + " that means you are besst! ");
                break;

            case 2:
                System.out.println("you inputed " + a + " that means you are excilent! ");
                break;

            case 3:
                System.out.println("you inputed " + a + " that means you are genius! ");
                break;

            case 4:
                System.out.println("you inputed " + a + " that means you are amzing! ");
                break;
        
            default:
                 System.out.println("Please ! input any positive integer.");
                break;
        }
        
        
    }
}
