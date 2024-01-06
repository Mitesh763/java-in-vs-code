
//DISTANCE BETWEEN TWO PONITS 

class DistanceTWoPoint {
    double SP, EP;

    DistanceTWoPoint() {
        SP = EP = 0;
    }

    DistanceTWoPoint(int a, int b) {
        System.out.println("Distance between Two integer value ");
        SP = a;
        EP = b;
    }

    DistanceTWoPoint(Double a, Double b) {
        System.out.println("Distance between Double integer value ");
        SP = a;
        EP = b;
    }

    DistanceTWoPoint(int a, Double b) {
        System.out.println("Distance between a integer value and a Double value ");
        SP = a;
        EP = b;
    }

    DistanceTWoPoint(Double a, int b) {
        System.out.println("Distance between a Double value and a integer value ");
        SP = a;
        EP = b;
    }

    public double FindDistance() {
        return SP - EP;
    }
}

public class Clg_16_Distance {
    public static void main(String[] args) {

        DistanceTWoPoint d1 = new DistanceTWoPoint(5, 1.6);
        System.out.println("Distance between two points : " + d1.FindDistance());
    }
}