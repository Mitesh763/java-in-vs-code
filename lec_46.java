
// CONSTRUCTORS IN INHERITANCE

class Base1 {
    int x;

    Base1() {
        System.out.println("this is parent");
    }

    Base1(int x) {
        System.out.println("this is parent constructor with arg x: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("this is child constructors without args.");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("this child constructor with x,y args.");
    }
}

class gra_child extends Derived1 {
    
    gra_child() {
        System.out.println("this is child of derived1 without args");
    }

    gra_child(int x, int y, int z) {
        super(x, y);
        System.out.println(" this is child of direved1 with parameter x,y,z.");
    }
}

public class lec_46 {
    public static void main(String[] args) {
        // Base1 b1 = new Base1(); //call base1 without args in base class
        // Derived1 d1 =new Derived1(); // call derived1 class then base1 without args
        // Derived1 d2 = new Derived1(7,5); // call DErivd1 class then base1 class with
        // two args
        // gra_child g1 = new gra_child(); //call gar_child class ->direved1 ->base1
        // without args
        gra_child g2 = new gra_child(4, 5, 6); // call gra_child wiht x,y,z args

    }
}