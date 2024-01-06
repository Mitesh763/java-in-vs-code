
// PALINDROME CHECKER 


import java.util.Scanner;

public class clg_prog_Palndrome_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.nextLine();

        String str2 = Palindrome(str);

        if (str == str2) {
            System.out.println("is Palindrome..1");
        } else {
            System.out.println("not Palindrome..!");
        }
    }

    public static String Palindrome(String str) {
            char[] ch1 = str.toCharArray();
            char[]  str2;
            int len = ch1.length;

            for (char i = ch1[len -1 ]; i != ch1[0]; i--) {
                str2 = [i];
            }
            String str3 = new String(str2);
            return str3;
    }
}