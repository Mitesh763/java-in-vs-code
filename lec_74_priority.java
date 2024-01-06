
// PRIORITY IN THREAD


class MyThrCon1 extends Thread {
    public MyThrCon1(String name) {
        super(name);
    }

    public MyThrCon1(Runnable r) {
        super(r);
    }

    public MyThrCon1(Runnable r, String str) {
        super(r, str);
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            
             System.out.println("ID!" + this.getId());
            System.out.println("i am constructord..!" + this.getName());
        }
    }
}

public class lec_74_priority {
    public static void main(String[] args) {

        MyThrCon1 t1 = new MyThrCon1("123");
        MyThrCon1 t2 = new MyThrCon1("456");
        MyThrCon1 t3 = new MyThrCon1("789");
        MyThrCon1 t4 = new MyThrCon1(t3);
        MyThrCon1 t5 =new MyThrCon1(t4, "91011");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
     }
}