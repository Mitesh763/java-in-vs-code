
// CURRENT TIME IN MILLISECOND


public class Lec_96_date {
    public static void main(String[] args) {

        // IN JAVA TIME COUNT IN MILISECOND  from     1 january 1970

        System.out.println("time in milisecond : " + System.currentTimeMillis());
        System.out.println("time in second : " + System.currentTimeMillis()/1000);
        System.out.println("time in minutes : " + System.currentTimeMillis()/1000/60);
        System.out.println("time in hours : " + System.currentTimeMillis()/1000/60/60);
        System.out.println("time in days : " + System.currentTimeMillis()/1000/60/60/24);
        System.out.println("time in years : " + System.currentTimeMillis()/1000/60/60/24/365);
    }
}
