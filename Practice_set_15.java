
// PRACTICE SET 15

import java.util.Date;
import java.util.HashSet;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Practice_set_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // PROBLEM 1:
        /*

        
         * ArrayList<String> arr = new ArrayList<>();
         * System.out.println("Enter 10 students name in Arraylist : ");
         * for (int i = 0; i < 10; i++) {
         * String str = sc.nextLine();
         * arr.add(str);
         * }
         * 
         * System.out.println("\nyou inputed student name is : ");
         * for (String stu : arr) {
         * System.out.println(stu);
         * }
         */

        // PROBLEM 2:
        /*
         * Date d1 = new Date();
         * System.out.println(d1.getHours() + ":" + d1.getMinutes() + ":" +
         * d1.getSeconds());
         */

        // PROBLEM 3 :
        /*
         * Calendar cd1 = Calendar.getInstance();
         * ystem.out.println(cd1.get(Calendar.HOUR_OF_DAY) + ":" +
         * d1.get(Calendar.MINUTE) + ":" + cd1.get(Calendar.SECOND));
         */

        // PROBLEM 4:
        /*
         * LocalTime t1 = LocalTime.now();
         * DateTimeFormatter df = DateTimeFormatter.ofPattern("H:mm:s");
         * String str = t1.format(df);
         * System.out.println(str);
         */

        // PROBLEM 5:
        HashSet<Integer> sh = new HashSet<>();
        sh.add(5);
        sh.add(51);
        sh.add(94);
        sh.add(16);
        sh.add(63);
        sh.add(51);
        sh.add(5);
        System.out.println(sh);
    }
}
