class OddNumber extends Thread {
    private int limit;

    public OddNumber(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);
        }
    }
}

public class Clg_28_oddnumusethread {
    public static void main(String[] args) {
        int limit = 10;

        // Create and start the thread
        OddNumber on = new OddNumber(limit);
        on.start();
    }
}