
// FINALLY EXCEPTION 

public class lec_85_finally {

    public static int Divide1(int a, int b) {

        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("We failed to perform this operation. Because :  " + e + " occurs...!");

        } finally {
            System.out.println("I am finally ...  so ..  i executed in any situations..!");
        }
        return 0;
    }

    public static void main(String[] args) {
        int re1 = Divide1(5, 0);
        System.out.println(re1);

        boolean bol = true;
        int a = 8, b = 5;
        while (bol) {
            try {
                int c = a / b;
                System.out.println(c);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally ...  so ..  i executed in any situations..! with b : " + b);
            }
            b--;
        }
    }
}
