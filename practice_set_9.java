
//  practice set

// Problem 1 

class Cylinder {
    private int radius;
    private int height;

    public int getradius() {
        return radius;
    }

    public int getheigh() {
        return height;
    }

    public void setradius(int a) {
        radius = a;
        System.out.println(radius);
    }

    public void setheight(int b) {
        height = b;
        System.out.println(height);
    }

    // Problem 2:

    public double sur_Area() {
        return (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Problem 3:
class Area_vol {
    int radius;
    int height;

    Area_vol() {
        radius = height = 0;
    }

    Area_vol(int a, int b) {
        radius = a;
        height = b;
    }

    Area_vol(int x) {
        radius = height = x;
    }

    double Surface_Area() {
        return (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
    }

    double Volume() {
        return Math.PI * radius * radius * height;
    }
}

//Problem 

public class practice_set_9 {
    public static void main(String[] args) {

        // Problem 1

        /*
         * Cylinder obj = new Cylinder();
         * System.out.println(obj.getradius());
         * System.out.println(obj.getheigh());
         * obj.setheight(54);
         * obj.setradius(85);
         */

        // Problem 2
        /*
         * System.out.println(obj.sur_Area());
         * System.out.println(obj.volume());
         */

        // Problrem 3 :
        /*
         * Area_vol a1 = new Area_vol();
         * Area_vol a2 = new Area_vol(85, 54);
         * Area_vol a3 = new Area_vol(7);
         * 
         * System.out.println("Area is :" + a1.Surface_Area());
         * System.out.println("Area is :" + a2.Surface_Area());
         * System.out.println("Area is :" + a3.Surface_Area());
         * 
         * Area_vol b1 = new Area_vol();
         * Area_vol b2 = new Area_vol(85, 54);
         * Area_vol b3 = new Area_vol(4);
         * 
         * System.out.println("Area is :" + b1.Surface_Area());
         * System.out.println("Area is :" + b2.Surface_Area());
         * System.out.println("Area is :" + b3.Surface_Area());
         */
    }
}