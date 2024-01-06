
// GREGORIAN CALNDAR IS A SUBCLASSS OF CALENDAR



import java.util.Calendar;
import java.util.GregorianCalendar;

public class Lec_99_Gregorian {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();

        System.out.println("current time : " + c1.getTime());

        System.out.println(
                "time : " + c1.get(Calendar.HOUR_OF_DAY) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND)
                        + "\n" + c1.get(Calendar.DATE) + "/" + c1.get(Calendar.MONTH) + "/" + c1.get(Calendar.YEAR));

        GregorianCalendar gc1 = new GregorianCalendar();
        
        System.out.println(gc1.getWeekYear());
        System.out.println(gc1.getFirstDayOfWeek());
        System.out.println(gc1.isLeapYear(2024));
        System.out.println(gc1.compareTo(c1));
    }
}