
public class pracice_set_7 {
    // 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    // 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // 3
    static int sum(int n) {
        int result = 0;
        if (n == 1) {
            return 1;
        } else {
            // int result=0;
            result = n + sum(n - 1);
        }
        return result;
    }

    // 4
    static void pattern2(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // 5
    static int fibo(int n) {
        /*
         * if (n==1) {
         * return 0;
         * }
         * else if (n==2) {
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // 6
    static float avg(float... arr) {
        float average = 0;
        for (float i : arr) {
            // float n =arr.length;
            average = (average + i) / arr.length;
        }
        return average;
    }

    // 7
    static void pattern3(int n){
         if(n>0){
            for (int i = n; i >0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern3(n-1);
         }
    }

    //8
    static void pattern4(int n){
        if (n>0) {
            pattern4(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Quection :1
        /* multiplication(7); */

        // Question : 2
        /* pattern1(8); */

        // Question : 3
        /*
         * int c = sum(9);
         * System.out.println("The sum of first n natural is " + c);
         */

        // Question : 4
        /* pattern2(4); */

        // Question : 5
        /*
         * int res = fibo(7);
         * System.out.print("Fibonacci series is: " + res );
         */

        // Question : 6

        // System.out.println(" Average of Given integer is " +
        // avg(40.0f,20.0f,14.0f,15.0f,62.0f,85.0f));

        // Question : 7
        //pattern3(7);

        //Question : 8
        pattern4(4);
    }
}
