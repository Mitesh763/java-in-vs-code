
// SHAPE CLASS

abstract class Shape {
    double length;
    double base;
    double height;
    double width;
    double radius;

    abstract void Area();
}

class Triangle extends Shape {

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void Area() {
        System.out.println("Area of Triangle is : " + (1 / 2.0) * base * height);
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void Area() {
        System.out.println("Area of Rectangle is : " + length * width);
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    public void Area() {
        System.out.println("Area of Circle is : " + Math.PI * Math.pow(radius, 2));
    }
}

public class Clg_21_Shape {
    public static void main(String[] args) {
        Triangle tri = new Triangle(20.3, 4.7);
        Rectangle rect = new Rectangle(6, 8.5);
        Circle cir = new Circle(7.7);

        tri.Area();
        rect.Area();
        cir.Area();

    }
}