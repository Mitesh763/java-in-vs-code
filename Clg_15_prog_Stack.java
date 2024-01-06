
// STACK IMPLEMENTATION : 

import java.util.Scanner;
import java.util.Stack;

public class Clg_15_prog_Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> St1 = new Stack<>();
        boolean bol = true;

        while (bol) {
            System.out.println(
                    "\n \nChoices: \n1--> For Empty or not..\n2--> For PUSH Operation..\n3--> For POP Operation..\n4-->For Search Operation..\n5--> For PEEK Operation..\n \nEnter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    boolean bol2 = St1.empty();
                    if (bol2 == true) {
                        System.out.println("Stack is EMpty now..!");
                    }
                    break;

                case 2:
                    System.out.println("PUSH Operation");
                    System.out.println("Enter Element : ");
                    int ele = sc.nextInt();
                    St1.push(ele);
                    System.out.println(St1);
                    break;

                case 3:
                    System.out.println("POP Operation :  ");
                    St1.pop();
                    System.out.println(St1);
                    break;

                case 4:
                    System.out.println("SEARCH Operation :");
                    System.out.println("Enter Searching Element :");
                    int search = sc.nextInt();
                    int flag = St1.search(search);
                    if (flag == -1) {
                        System.out.println("Element not founded..!");
                    } else {
                        System.out.println("Element founded..!");
                    }
                    break;

                case 5:
                    System.out.println("PEEK Operation :");
                    St1.peek();
                    System.out.println(St1);
                    break;

                default:
                    System.out.println("Invalid choice............!!!!");
            }
        }
    }
}
