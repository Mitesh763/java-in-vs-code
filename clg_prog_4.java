import javafx.scene.shape.Circle;

//constructors

class Circle {
    float radius;

    Circle() {
        radius = 0.0f;
    }

    Circle(float a) {
        radius = a;
    }

    Circle(Circle b) {
        radius = b.radius;
    }

    float Area() {
        return 3.14f * radius * radius;
    }

    float Circumference() {
        return 2 * 3.14f * radius;
    }
}

public class clg_prog_4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0f);
        Circle c3 = new Circle(c2);
        System.out.println(c1.Area());
        System.out.println(c2.Area());
        System.out.println(c3.Area());
        System.out.println(c1.Circumference());
        System.out.println(c2.Circumference());
        System.out.println(c3.Circumference());
    }
}
