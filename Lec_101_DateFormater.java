
// datetime formatter



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lec_101_DateFormater {
    public static void main(String[] args) {

        // local time date
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;


        // format date and time
        String str = dt.format(df2);
        System.out.println("After formatting : " + str);


    }
}