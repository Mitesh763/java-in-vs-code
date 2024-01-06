import java.util.*;

class StudentClass {

    Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> enro_no = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    public static ArrayList<Integer> semester = new ArrayList<>();

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

        }

    }

    void display() {
        System.out.println("-------------------------------");
        System.out.println("enro num.   name   semester ");
        System.out.println("-------------------------------");
        for (int i = 0; i < name.size(); i++) {
            System.out.print("\n" + enro_no.get(i) + "  ||    " + name.get(i) + "      " + semester.get(i));
        }
        System.out.println("\n");
    }
}

class Exam extends StudentClass {
    public static ArrayList<Double> midSemMarks = new ArrayList<>();
    public static ArrayList<Double> SubmissionMarks = new ArrayList<>();
    public static ArrayList<Double> InternalMarks = new ArrayList<>();

    void MarksStore() {
        for (int i = 0; i < name.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter MID-SEM Marks subject  " + (j + 1) + " of  student " + (i + 1) + " : ");
                Double mid = sc.nextDouble();
                midSemMarks.add(mid);
            }
            System.out.println();

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Submission Marks subject  " + (j + 1) + " of  student " + (i + 1) + " : ");
                Double SubMa = sc.nextDouble();
                SubmissionMarks.add(SubMa);
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter INTERNAL Marks subject  " + (j + 1) + " of  student " + (i + 1) + " : ");
                Double intMa = sc.nextDouble();
                InternalMarks.add(intMa);
            }
            System.out.println();
        }
    }

    void display1() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Marks in MID SEMSTER Exam      Marks in SUBMISSION       Marks in INTERNAL      ");
        System.out.println("sub1     sub2     sub3       sub1     sub2     sub3    sub1     sub2     sub3");
        System.out.println("------------------------------------------------------------------------------------");
        int tempNum = 0, temp2 = 0;
        for (int i = 0; i < enro_no.size(); i++) {
            for (int j = temp2; j < 3 + temp2; j++) {
                System.out.print(" || " + midSemMarks.get(j));
            }
            temp2 = tempNum;
            System.out.print("   ");
            for (int j = temp2; j < 3 + temp2; j++) {
                System.out.print(" || " + SubmissionMarks.get(j));
            }
            temp2 = tempNum;
            System.out.print("   ");
            for (int j = temp2; j < 3 + temp2; j++) {
                System.out.print(" || " + InternalMarks.get(j));
                tempNum += 1;
            }
            temp2 = tempNum;
            System.out.println();
        }
    }
}

class Result extends Exam {
    public void result1() {

        int tempNum1 = 0, temp12 = 0;
        double totalMarks = 0;
        for (int i = 0; i < name.size(); i++) {

            System.out.print("\nMID-SEM EXAM Marks of student  " + (i + 1) + " : ");

            for (int j = temp12; j < 3 + temp12; j++) {
                System.out.print("   " + midSemMarks.get(j));
                totalMarks += midSemMarks.get(j);
            }
            System.out.print("\ntotal MArks in MID-SEM EXAM : " + totalMarks + "\nAverage MArks in MID-SEM EXAM : "
                    + (totalMarks / 3));
            totalMarks = 0;
            temp12 = tempNum1;
            System.out.println();

            System.out.print("\nSUBMISSION Marks of student  " + (i + 1) + " : ");
            for (int j = temp12; j < 3 + temp12; j++) {
                System.out.print("    " + SubmissionMarks.get(j));
                totalMarks += SubmissionMarks.get(j);
            }
            System.out.print("\ntotal MArks in MID-SEM EXAM : " + totalMarks + "\nAverage MArks in MID-SEM EXAM : "
                    + (totalMarks / 3));
            totalMarks = 0;
            temp12 = tempNum1;
            System.out.println();

            System.out.print("\nINTERNAL Marks of student  " + (i + 1) + " : ");
            for (int j = temp12; j < 3 + temp12; j++) {
                System.out.print("    " + InternalMarks.get(j));
                tempNum1 += 1;
                totalMarks += InternalMarks.get(j);
            }
            System.out.print("\ntotal MArks in MID-SEM EXAM : " + totalMarks + "\nAverage MArks in MID-SEM EXAM : "
                    + (totalMarks / 3));
            totalMarks = 0;
            temp12 = tempNum1;
            System.out.println();
        }

    }
}

public class Clg_19_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number of student : ");
        int n = sc.nextInt();
        StudentClass s = new StudentClass();
        Exam ex = new Exam();
        Result res = new Result();
        s.input(n);
        s.display();
        ex.MarksStore();
        ex.display1();
        res.result1();
    }
}