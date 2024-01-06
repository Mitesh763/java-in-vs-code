//throw and throws 

class NegativeRadException extends Exception {
    @Override
    public String toString() {
        return "Negative radious cann't be accept";
    }
}

public class lec_84_throw_throws {

    public static double Area(double radious) throws NegativeRadException {
        if (radious < 0) {
            throw new NegativeRadException();
        }
        double ar = Math.PI * radious * radious;
        return ar;
    }

    public static int Divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int res = Divide(5, 0);
            System.out.println(res);
            double resu = Area(-4);
            System.out.println(resu);
        } catch (Exception e) {
            System.out.println("Exception..!  " + e);
            System.out.println("exception : " + e);
        }
    }
}