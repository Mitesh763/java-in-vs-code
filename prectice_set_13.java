
// PRACTICE SET 13

class Practice_thread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            // PROBLEM 2 :
            // -----
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            // ----
            System.out.println("Good Morning..!");
        }
    }
}

class Prectice_thread_1 implements Runnable {
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("Welcome..!");
        }
    }
}

class Prectice_thread_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println("Welcome in GECM..!");
        }
    }
}

public class prectice_set_13 {
    public static void main(String[] args) {

        // PROBLEM 1 :
        Practice_thread bullet1 = new Practice_thread();
        Thread gun1 = new Thread(bullet1);

        Prectice_thread_1 bullet2 = new Prectice_thread_1();
        Thread gun2 = new Thread(bullet2);
        Prectice_thread_2 bullet3 = new Prectice_thread_2();
        Thread gun3 = new Thread(bullet3);

        // PROBLEM 3:
        // ------
        System.out.println(gun1.getPriority()); // normal priority is ----> 1
        gun2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(gun2.getPriority()); // max priority is ---> 10
        gun3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(gun3.getPriority()); // min priority is ---> 5

        System.out.println(gun1.getState()); // PRBLEM ---> STATE
        // ------

        gun1.start();
        System.out.println(gun1.getState()); // PROBLEM 4 --> STATE
        System.out.println(Thread.currentThread()); // problem 5 --> reference
        gun2.start();
        gun3.start();

    }
}