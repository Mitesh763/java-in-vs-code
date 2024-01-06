public class lec_33 {

   /*  static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    */

    // THRRE DOTS ARE USE AS A GENERAL ARRAY SHOW IN BELOW

    static int sum(int x,int ...arr){
        int res=0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }
    public static void main(String[] args) {
           System.out.println("Welcome! to varargs Tutorials.");
           System.out.println("The sum of nothing is :" + sum(0)); //if we want to not calling function wthout enter any actul args then use like .......INT X
           System.out.println("the sum of 1 is :" + sum(1));
           System.out.println("The sum of 4 and 5 is: " + sum(4,5));
           System.out.println("The sum of 4,5 and 6 is: " + sum(4,5,6));
           System.out.println("the sum of 4,5,6 and 7 is : "+ sum(4,5,6,7));
    }
}
