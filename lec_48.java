
// METHOD OVERRIDING

class A {
    public void print1() {
        System.out.println("I am method 1 of A class");
    }
    public void print2(){
        System.out.println("Iam method 2 of A class");
    }
}
class B extends A {
            public void print2(){
                System.out.println("I am mrthod 2 of B class");
            }
            public void print3(){
                System.out.println("I am method 3 of B class");
            }
            
}

public class lec_48 {
    public static void main(String[] args) {
        A a1 = new A();
      //  a1.print1();

        B b1 = new B();
      //  b1.print1();

        a1.print2();
        b1.print2();
    }
}
