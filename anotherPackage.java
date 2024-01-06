
 package  accmodifier.modifier;

class c5 extends c1{
    void meth4(){
        System.out.println("suclass");
        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
        // System.out.println(s);
    }
}
public class anotherPackage {
    public static void main(String[] args) {
        System.out.println("i am checking modifier timeline..!");
        
        c5 c =new c5();
        c.meth4();
        System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(c.p);
        // System.out.println(c.s); 
    }
}
