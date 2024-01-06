
// CREATE THREAD CLASS USING RUNNABLE INTERFACE

class MyThread1 implements Runnable {
    public void run() {
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
        System.out.println("my name is mitesh");
    }
}

class MyThread2 implements Runnable {
    public void run() {
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
        System.out.println("i am thread 2..!");
    }

}

public class lec_71_runnable_thread {
    public static void main(String[] args) {

        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);

        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}