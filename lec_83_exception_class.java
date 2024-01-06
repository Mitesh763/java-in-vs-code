import java.util.Scanner;

// EXCEPTION CLASS

class MyException extends Exception {
    @Override
    public String toString() {
        return "i am toString()";
    }

    public String getMessage() {
        return "i am getMessage()";
    }
}

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age..!";
    }

    public String getMessage() {
        return "How Are You..?";
    }
}

public class lec_83_exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter :");
        int a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
                // throw new ArithmeticException("this is exception...!");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("this 83 program finished..!");
            }
            System.out.println("hello.........!");
        }
    }
}
