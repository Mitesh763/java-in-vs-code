import java.text.BreakIterator;
import java.util.Scanner;

public class practice_set_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Q_1 : make a error by assign operator
    // byte a=10;
    // if(byte a =1){
    // }

    // Q_2 :
    // System.out.print("Enter your MATHS Marks: ");
    // byte Mark_1= sc.nextByte();

    // System.out.print("Enter yout COA Marks: ");
    // byte Mark_2 = sc.nextByte();

    // System.out.print("Enter your OOP Marks: ");
    // byte Mark_3 = sc.nextByte();

    // float avg = ( Mark_1 + Mark_2 + Mark_3 )/3.0f;
    // System.out.println("you get average " + avg );

    // if (avg>40 && Mark_1>33 && Mark_2>33 && Mark_3>33) {
    // System.out.println("Congratulation,you are pass!");
    // }
    // else{
    // System.out.println("Sorry! you are not pass");
    // }

    // Q_3 :
    // System.out.print("Enter your Income in lakh: ");
    // float tax=0.0f;
    // float income = sc.nextFloat();

    // if(income<=2.5f){
    // tax=tax+0;
    // }
    // else if(income > 2.5f && income <= 5.0f){
    // tax = tax + 0.05f * (income - 2.5f);
    // }
    // else if(income > 5.0f && income <= 10.0f){
    // tax = tax +( 0.05f * (5.0f - 2.5f));
    // tax = tax + (0.2f * (income - 5.0f));
    // }
    // else(income > 10.0f){
    // tax = tax + 0.05f *(5.0f - 2.5f);
    // tax = tax + 0.2f * (10.0f - 5.0f);
    // tax = tax + 0.3f * (income - 10.0f);
    // }
    // System.out.println("Total tax paid by the employee: " + tax);

    // Q_4 :
    // System.out.print("Enter number between 1 to 7:  ");
    // byte a = sc.nextByte();
    // switch (a) {
    //   case 1:
    //     System.out.println("MONDAY");
    //     break;
    //   case 2:
    //     System.out.println("TUESDAY");
    //     break;
    //   case 3:
    //     System.out.println("WEDNESDAY");
    //     break;
    //   case 4:
    //     System.out.println("THRUSDAY");
    //     break;
    //   case 5:
    //     System.out.println("FRIDAY");
    //     break;
    //   case 6:
    //     System.out.println("SATURDAY");
    //     break;
    //   case 7:
    //     System.out.println("SUNDAY");
    //     break;
    //   default:
    //     System.out.println("PLEASE ! Enter number betwwen 1 to 7");
    // }

    // Q_5 :
    // System.out.print("Enter year:  ");
    // short year = sc .nextShort();

    // if( year%4 == 0  ||  year%400 == 0 ){
    //   System.out.println("You Entered leap year!");
    // }
    // else{
    //   System.out.println("You entered year is not leap year");
    // }

    //Q_6 :
    System.out.print("Enter website types :  ");
    String web = sc.nextLine();

    if(web.endsWith(".org"))
    {
      System.out.println("this is organizational website!");
    }
    else if(web.endsWith(".com")){
      System.out.println("this is commercial website1");
    }
    else if(web.endsWith(".in")){
      System.out.println("this is an indian website!");
    }
    else{
      System.out.println("Couldn't find!");
    }
  }
}