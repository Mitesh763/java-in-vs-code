
//  DYNAMIC METHOD DISPATCH



class Phone {

    public void ON() {
        System.out.println("Turn ON phone");
    }

    public void Music() {
        System.out.println("Play Music");
    }
}

class SmartPhone extends Phone {
    @Override
    public void ON() {
        System.out.println("Turn ON smartphone.");
    }

    public void Draw() {
        System.out.println("Drawing");
    }
}

public class lec_49 {
    public static void main(String[] args) {

        // Phone obj1 = new Phone();
        // SmartPhone obj2 =new SmartPhone();

        // obj2.ON();

        Phone obj3 = new SmartPhone();
        obj3.ON(); // call on method in smartphone
        // obj3.Music();
        // obj3.Draw(); // get error

        // SmartPhone obj4 = new Phone(); // get error
    }
}