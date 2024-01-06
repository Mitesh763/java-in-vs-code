
// PRACTISE SET 10

// PROBLEM 1: 
class Circle1 {
    int radius;

    Circle1() {
        radius = 7;
        System.out.println("circle");
    }

    Circle1(int a) {
        System.out.println("constructor of circle");
        radius = a;
    }

    /**
     * @return double
     */
    public double Area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle1 {
    int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("constructor of cylinder class");
        this.height = h;
    }

    public double Volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

// PROBLEM 2 :
class Cuboid {
    int length;
    int width;
    int height;

    public int get_cuboid() {
        System.out.println("I am getter");
        return height;
    }

    public void set_cuboid(int ab, int bc, int cd) {
        height = ab;
        System.out.println("I am setter");
    }

    Cuboid() {
        height = 0;
        System.out.println("I am a Cuboid...!");
    }

    Cuboid(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double Volume() {
        return length * height * width;
    }

    public double Surace_Area() {
        return 2 * (length * width + height * length + height * width);
    }
}

class Rectangle1 extends Cuboid {
    Rectangle1() {
        System.out.println("Inheritance of Cuboid...!");
    }

    Rectangle1(int l, int w, int h) {
        super(l, w, h);
        this.length = l;
        this.width = w;
    }

    public double Rect_Area() {
        return width * length;
    }
}

// PROBLEM 3 :

public class practise_set_10 {
    public static void main(String[] args) {

        // PROBLEM 1 & 3 :
        /*
         * Circle1 c1 =new Circle1(7);
         * System.out.println(c1.Area());
         * 
         * Cylinder1 cy1 = new Cylinder1(7,5);
         * System.out.println(cy1.Volume());
         * 
         */

        /*
         * // PROBLEM 2 & 4 :
         * Cuboid cu1 = new Cuboid();
         * System.out.println(cu1.Surace_Area());
         * System.out.println(cu1.Volume());
         * System.out.println(cu1.get_cuboid());
         * cu1.set_cuboid(7,8,9);
         * 
         * Rectangle1 re1 = new Rectangle1(7, 8, 9);
         * System.out.println(re1.Rect_Area());
         * System.out.println(re1.Volume());
         * System.out.println(re1.Surace_Area());
         */

        // PROBLEM 5 :
    }
}