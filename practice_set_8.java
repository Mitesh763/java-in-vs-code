import org.w3c.dom.css.Rect;

class employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String str) {
        name = str;
    }
}

class Cellphone {
    public void vibrate() {
        System.out.println("Vibrating.......!");
    }

    public void ring() {
        System.out.println("Ringin.....!");
    }

    public void Callfriend() {
        System.out.println("Calling Friend....!");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int length;
    int width;

    public int Area() {
        return length * width;
    }

    public int Perimeter() {
        return 2 * (length * width);
    }
}

class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting...!");
    }

    public void firing() {
        System.out.println("enemy Firing...!");
    }

    public void run() {
        System.out.println("Enemy Runing...!");
    }
}
class Circle{
    float radious;
     
    public float Area(){
        return  3.14f*(radious*radious);
    }
    public float parigh(){
        return 2*3.14f*radious;
    }
}

public class practice_set_8 {
    public static void main(String[] args) {

        /*
         * // Problem 1 :
         * employee emp = new employee();
         * 
         * emp.salary = 7;
         * System.out.println(emp.getsalary());
         * emp.name = "mitesh";
         * System.out.println(emp.getname());
         * emp.setname("vaghela");
         */

        /*
         * //Problem :
         * Cellphone Redmi = new Cellphone();
         * Redmi.vibrate();
         * Redmi.ring();
         * Redmi.Callfriend();
         */

        /*
         * //Problem 3:
         * Square sq= new Square();
         * sq.side=7;
         * System.out.println("Area is : " + sq.area());
         * System.out.println("Perimeter is : " + sq.perimeter());
         */

        /*
         * //Problem 4:
         * Rectangle rect = new Rectangle();
         * 
         * rect.length=10;
         * rect.width=20;
         * System.out.println("Area is : " + rect.Area());
         * System.out.println("Perimeter is : " + rect.Perimeter());
         */

        /* 
        // Problem 5;
        TommyVecetti tv = new TommyVecetti();
        tv.hitting();
        tv.firing();
        tv.run();
        */

        /* */
        //Problem 8 :
              Circle cir = new Circle();

              cir.radious=4;
              System.out.println("Area : "+ cir.Area());
              System.out.println("Parigh: " + cir.parigh());
    } 
}