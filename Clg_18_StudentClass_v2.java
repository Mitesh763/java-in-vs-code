import java.util.*;

class StudentClass {
    public static ArrayList<Integer> enro_no = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Integer> semester = new ArrayList<>();
    public static ArrayList<Double> subject = new ArrayList<>();
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

            for (int j = 0; j < 5; j++) {

                System.out.print("Enter subject " + (j + 1) + " Marks of student " + (i + 1) + " : ");
                Double sub = sc.nextDouble();
                subject.add(sub);

            }
            System.out.print("Enter Privious Year SPI of student " + (i + 1) + " : ");
            Double s = sc.nextDouble();
            spi.add(i, s);
        }
    }

    void display(int n) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("enro num.    name   semester    sub1     sub2     sub3      sub4     sub5       SPI");
        System.out.println("-----------------------------------------------------------------------------------");
        int tempNum = 0, temp2 = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(enro_no.get(i) + "  ||    " + name.get(i) + "      " + semester.get(i) + " ||   ");

            for (int j = temp2; j < 5 + temp2; j++) {
                System.out.print("    ||   " + subject.get(j));
                tempNum += 1;
            }
            temp2 = tempNum;
            System.out.print("      ||  " + spi.get(i));
            System.out.println("\n");
        }
    }
}

class Result extends StudentClass {
    public void reselt() {

        int tempNum1 = 0, temp12 = 0;
        double totalMarks = 0;
        for (int i = 0; i < name.size(); i++) {

            System.out.print("\nMarks of student  " + (i + 1) + " : ");

            for (int j = temp12; j < 5 + temp12; j++) {
                System.out.print("    " + subject.get(j));
                tempNum1 += 1;
                totalMarks += subject.get(j);
            }
            System.out.print("\ntotal MArks : " + totalMarks + "\nCurrent semster SPI : " + (totalMarks / 50));
            totalMarks = 0;
            temp12 = tempNum1;
            System.out.println();
        }
    }
}

public class Clg_18_StudentClass_v2 {
    public static void main(String[] args) {
        Result res11 = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student : ");
        int n = sc.nextInt();
        StudentClass sc1 = new StudentClass();
        sc1.input(n);
        sc1.display(n);
        res11.reselt();

    }
}