
// INHERITANCE

class Base {
    int x;

    public void setx(int a) {
        x = a;
        System.out.println(x);
    }

    public int getx() {
        System.out.println("Hello ! Welcome in Inheritance......!");
        return x;
    }
}

// derived class from base class using inheritance
class Derived extends Base {

}

public class lec_45 {
    public static void main(String[] args) {

        // use base class in create an object
        Base b = new Base();
        b.setx(45);
        System.out.println(b.getx());

        // use derived class in create an object
        Derived d = new Derived();
        d.setx(95);
        System.out.println(d.getx());

    }
}
