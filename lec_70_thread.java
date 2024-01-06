
// CREATE THEEADING USING EXTEND CLASS  --->INHERITANCE

class thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 1 is run for task 1...!");
            System.out.println("hiiiii...!");
            i++;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 2 is run for task 2...!");
            System.out.println("hello..!");
            i++;
        }
    }
}

class thread3 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 3 is run for task 3...!");
            System.out.println("GM..!");
            i++;
        }
    }
}

public class lec_70_thread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}