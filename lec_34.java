public class lec_34 {
    static int factorial(int n) {
        // factorial(5)=5*4*3*2*1
        // factorial(n)=n*n-1*n-2*.....* 1

        // using recursion :
        /*
         * if(n==0 || n==1){
         * return 1;
         * }
         * else{
         * return n*factorial(n-1);
         * }
         */

        // using for loop
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {

            int fact = 1;
            for (int i = n; i >0; i--) {
                fact *= i;

            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int n;
        int result = factorial(5);
        System.out.println("factorial uaing recursion : " + result);
        System.out.println("factorial using for loop : " + result);
    }
}
