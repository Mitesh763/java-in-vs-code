
// USE OF TRY - CATCH  IN  EXCEPTION 


public class lec_80_try_catch {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        // int c = a / b;
        // with out try - catch
        // System.out.println("Division is : " + c);

        // with try-catch
        try {
            int c = a / b;
            System.out.println("Division is : " + c);
        } catch (Exception e) {
            System.out.println("We failed to perform this operation. Because : ");
            System.out.println(e);
        }
        System.out.println("End of Program..!");

    }
}
