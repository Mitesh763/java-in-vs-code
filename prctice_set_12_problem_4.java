package calcu;

class SubClass extends Calculator{
         void problem4(){
            System.out.println(x);
            // System.out.println(y);
         }
}
 

public class prctice_set_12_problem_4 {
    public static void main(String[] args) {
     
        SubClass s2 = new SubClass();
        s2.problem4();
    }
}
