import java.util.Scanner;

// Add two complex numbers : 

class ComplexNumAdd {
    double real, img;

    ComplexNumAdd(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void ADD(ComplexNumAdd cna) {
        this.real += cna.real;
        this.img = img + cna.img;
    }

    void display() {
        System.out.println("Addition of two Complex Number : " + this.real + " + " + this.img + " i ");
    }
}

public class Clg_17_compleexVariabl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Real number : ");
        double real1 = sc.nextDouble();
        System.out.println("Enter 1st imeganery number : ");
        double img1 = sc.nextDouble();
        System.out.println("Enter 2nd Real number : ");
        double real2 = sc.nextDouble();
        System.out.println("Enter 2nd imeganery number : ");
        double img2 = sc.nextDouble();

        ComplexNumAdd c1 = new ComplexNumAdd(real1, img1);
        ComplexNumAdd c2 = new ComplexNumAdd(real2, img2);

        c1.ADD(c2);
        c1.display();
    }
}