import java.util.Scanner;

// EXCEPTION 

class AgeIsLessThan18Exception extends Exception {
    public String toString() {
        return "Enter Age is Less Than 18 year";
    }
}

public class Clg_23_licence {
    public static String EligibleLicense(int age) throws AgeIsLessThan18Exception {
        if (age < 18) {
            throw new AgeIsLessThan18Exception();
        }
        return "You Are Eligible For Application of License availability...!";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        try {
            String str = EligibleLicense(age);
            System.out.println(str);
        } 
         catch (Exception e) {
            System.out.println("exceptin : " + e);
         }

    }
}