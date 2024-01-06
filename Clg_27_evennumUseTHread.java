 class EvenNumber implements Runnable {
    private int maxNumber;

    public EvenNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 2; i <= maxNumber; i += 2) {
            System.out.println(i);
        }
    }
}

public class Clg_27_evennumUseTHread {
    public static void main(String[] args) {
        int maxNumber = 10;
        Thread evenThread = new Thread(new EvenNumber(maxNumber));
        evenThread.start();
    }
}