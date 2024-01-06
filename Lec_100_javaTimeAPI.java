import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

// java.time PACKAGE

public class Lec_100_javaTimeAPI {
    public static void main(String[] args) {

        // clock class
        // Clock o1 =Clock.systemDefaultZone();
        // System.out.println(o1.getClass() + " \n " + o1.getZone());

        // abstract instant
        // Clock o2 = Clock.systemUTC();
        // System.out.println(o2.instant());

        // Duration Class
        // Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);
        // System.out.println(d1.isNegative());
        // Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        // System.out.println(d2.isNegative());

        // iss zero or not
        // Duration d3 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        // System.out.println(d3.isZero());

        // LocalDate
        // LocalDate d4 =LocalDate.now();
        // System.out.println(d4);

        // compare to :
        // LocalDate d5 = LocalDate.parse("2023-04-19");
        // LocalDate d6 = LocalDate.parse("2023-04-18");
        // LocalDate d7 = LocalDate.now();
        // System.out.println(d5.compareTo(d7));// return integer value
        // System.out.println(d5.equals(d7));//return boolean value

        //with year :
        // LocalDate d8 = LocalDate.parse("2023-04-19");
        // System.out.println(d8.withYear(2003));

        // local time
        // for (int i = 0; i < 20; i++) {
            
        //     LocalTime t1 = LocalTime.now();
        //     System.out.println(t1);
        // }

        // add and minus in time
        // LocalTime t2 =LocalTime.now();
        // LocalTime t3 =t2.plusHours(1);
        // LocalTime t4 =t2.minusHours(1);
        // System.out.println(t2);
        // System.out.println(t3);
        // System.out.println(t4);
    }
}