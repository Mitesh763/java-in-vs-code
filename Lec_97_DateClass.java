
// DATE CLASS

import java.util.Date;

public class Lec_97_DateClass {
    public static void main(String[] args) {
        
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());// millisecond
        System.out.println(d.getDate());//date only
        System.out.println(d.getMonth());// month only
        System.out.println(d.getYear());// year only from 1900 + 23 
    }
}
