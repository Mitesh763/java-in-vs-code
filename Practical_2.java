import java.util.Scanner;

public class Practical_2 {
  public static void main(String[] args) {

       
    Scanner sc = new Scanner(System.in);
    
    
        System.out.println("Enter student name: ");
        String name = sc.nextLine();


        System.out.println("Enter student ID: ");
        String id = sc.nextLine();

       
        System.out.println("Enter student branch: ");
        String branch =sc.next();


        System.out.println("Enter student SPI: ");
        float spi = sc.nextFloat();
    


        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Branch: " + branch);
        System.out.println("Student SPI: " + spi);
    
        sc.close();
  }
}
