
// ACCESS MODIFIERS
  package accmodifier;

class c1 {
    public byte a = 4;
    protected byte b = 5;
    int p = 8;
    private int s = 7;

    // public modifier
    void meth2() {
        System.out.println("class");
        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
        System.out.println(s);
    }
}

class c2 extends c1 {

    //private modifier
    void meth3() {
        System.out.println("subclass");
        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
    //    System.out.println(s);
    }
}

public class lec_66_access_modifier {
    public static void main(String[] args) {

       // public modifier
        c1 c =new c1();
         c.meth2();

        // private modifier
        // c1 c =new c1();
        // System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(c.p);
        // System.out.println(c.s); // error because private modifier

        c2 e = new c2();
        e.meth3();
    }
}
