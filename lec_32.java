

public class lec_32 {
    static void tellstory(){
        System.out.println("I invent new word"+
                             " plagiarism !");
    }

    static void change(int x){
        x=52;
    }

    static void change2(int[] m){
        m[1]=100;
    }

    static void foo(){
        System.out.println("Need of a student !");
    }

    static void foo(int a){
        System.out.println("Need of "+ a +" student!");
    }

    static void foo(int a,int b,int c){
        System.out.println("Need of "+ c +" student !");
    }
    public static void main(String[] args) {
      // tellstory();

      /*int a=45;
      change(a);
      System.out.println(a);
      */

      /*int[] arr={5,65,45};
      change2(arr);
      System.out.println(arr[1]);
      */

      foo();
      foo(100);
      foo(100, 200, 300);
    }
}