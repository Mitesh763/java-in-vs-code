
// THREAD CONSTRUCTORS

class MyThrCon extends Thread {
    public MyThrCon(String name) {
        super(name);
    }

    public MyThrCon(Runnable r) {
        super(r);
    }

    public MyThrCon(Runnable r , String str ){
        super(r, str);
    }

    public void run() {
        System.out.println("i am constructord..!");
    }
}

public class lec_73_thread_constructor {
    public static void main(String[] args) {
        MyThrCon t1 = new MyThrCon("mitesh");
        MyThrCon t2 = new MyThrCon("java");
        MyThrCon t3 = new MyThrCon(t1);
        MyThrCon t4 = new MyThrCon(t3, "GECM");

        t1.start();
        t2.start();

        System.out.println("Id of the thread t1 : " + t1.getId());
        System.out.println("name of the thread t1 : " + t1.getName());
        System.out.println("Id of the thread t2 : " + t2.getId());
        System.out.println("name of the thread t2 : " + t2.getName());
        System.out.println("ID of t3 : " + t3.getId());
        System.out.println(" " + t3.getName());
        System.out.println("ID of t4 : " + t4.getId());
        System.out.println("name of t4 : " + t4.getName());
    }
}