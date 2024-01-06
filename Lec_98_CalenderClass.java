import java.util.Calendar;

// ALENDER CLASS  (it is abstract class)

import java.util.*;

public class Lec_98_CalenderClass {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        // get

        // System.out.println("current year : " + c.get(Calendar.YEAR));
        // System.out.println("current month : " + c.get(Calendar.MONTH));//return [ 0 -
        // 11 ] here april -- > 3
        // System.out.println("current day : " + c.get(Calendar.DAY_OF_MONTH));
        // System.out.println("current hours : " + c.get(Calendar.HOUR_OF_DAY));
        // System.out.println("current minute : " + c.get(Calendar.MINUTE));
        // System.out.println("current second : " + c.get(Calendar.SECOND));

        // add

        // System.out.println("Current date is : " + c.getTime());
        // c.add(Calendar.YEAR, 7);
        // System.out.println("After 7 year date is : " + c.getTime());
        // c.add(Calendar.MONTH, -1);
        // System.out.println("Before 1 month : " + c.getTime());

        // no of week 

        System.out.println("No of weeks in one year : " +  c.getWeeksInWeekYear());
        System.out.println("Maximum No of weeks in one year : " +  c.getMaximum(c.WEEK_OF_YEAR));
    }
}
