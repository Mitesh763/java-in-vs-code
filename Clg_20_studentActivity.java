import java.util.*;

// import javax.print.attribute.standard.MediaSize.NA;

class StudentClass {
    public static ArrayList<Integer> enro_no = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Integer> semester = new ArrayList<>();
    public static ArrayList<Double> spi = new ArrayList<>();

    public void input(int n) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Enrollment number of Student " + (i + 1) + " : ");
            int en = sc.nextInt();
            enro_no.add(i, en);

            System.out.print("Enter name of student " + (i + 1) + " : ");
            String str = sc.next();
            name.add(i, str);

            System.out.print("Enter semester of student " + (i + 1) + " : ");
            int sem = sc.nextInt();
            semester.add(i, sem);

            System.out.print("Enter Privious SPI of student " + (i + 1) + " : ");
            Double s = sc.nextDouble();
            spi.add(i, s);
        }

    }

    void display(int n) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("enro num.    name    semester     SPI");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print(
                    enro_no.get(i) + "   ||     " + name.get(i) + "  ||  " + semester.get(i) + "     ||     "
                            + spi.get(i));
            System.out.println("\n");
        }
    }
}

interface Activity {
    void Activities();
}

class Final extends StudentClass implements Activity {

    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> type = new ArrayList<>();
    ArrayList<String> level = new ArrayList<>();
    ArrayList<Integer> point = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void Activities() {
        for (int i = 0; i < enro_no.size(); i++) {

            System.out.println("\nActivity of student " + (i + 1) + " : ");

            for (int j = 0; j < 3; j++) {

                System.out.println("\nActivity " + (j + 1) + " : ");

                System.out.println("Enetr Activity Name of activity" + (j + 1) + " : ");
                String name1 = sc.next();
                name.add(name1);
                System.out.println("Enter type of activity of activity" + (j + 1) + " : ");
                String type1 = sc.next();
                type.add(type1);
                System.out.println("Enter Level of Activity of activity" + (j + 1) + " : ");
                String level1 = sc.next();
                level.add(level1);
                System.out.println("Enter point of Activity of activity" + (j + 1) + " : ");
                int point1 = sc.nextInt();
                point.add(point1);
            }
            System.out.println();
            System.out.println();
        }
    }

    public void Performance() {

        int tempNum1 = 0, temp12 = 0;
        for (int i = 0; i < enro_no.size(); i++) {
            System.out.println();
            System.out.println("Student " + (i + 1) + " Enrollement Number : " + enro_no.get(i));
            System.out.println("Student " + (i + 1) + " Name : " + name.get(i));
            System.out.println("Student " + (i + 1) + " get SPI : " + spi.get(i));
            System.out.println("\nACTIVITIES performed by Sudent: " + (i + 1));
            for (int j = temp12; j < 3 + temp12; j++) {
                System.out.println();
                System.out.println("Name of Activity : " + name.get(j));
                System.out.println("Type of Activity : " + type.get(j));
                System.out.println("Level of Activity : " + level.get(j));
                System.out.println("Point of Activity : " + point.get(j));
                tempNum1 += 1;
            }
            temp12 = tempNum1;
            System.out.println();
        }
    }
}

public class Clg_20_studentActivity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student : ");
        int n = sc.nextInt();
        StudentClass sc1 = new StudentClass();
        Final fn = new Final();
        sc1.input(n);
        sc1.display(n);
        fn.Activities();
        fn.Performance();
    }
}