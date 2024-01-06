
// METHODS IN THREAD 


class MyNewThrCon1 extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
       
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             System.out.println("ID!" + this.getId());
            System.out.println("i am constructord..!" + this.getName());
        }
    }
}
class MyNewThrCon2 extends Thread{
    public void run(){
        for (int i = 0; i < 15; i++) {
            System.out.println("I am after waiting ..!");
        }
    }
}
class MyNewThrCon3 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("I am after waiting of thread 2 ..!");
        }
    }
}

public class lec_75_thread_method {
    public static void main(String[] args) {
    MyNewThrCon1 t1 =new MyNewThrCon1();
    MyNewThrCon2 t2 = new MyNewThrCon2();
    MyNewThrCon3 t3 = new MyNewThrCon3();

    t1.start();
    // try{
    //     t1.join();
    // }
    // catch(Exception a){
    //     System.out.println(a);
    // }
    t2.start();
    t3.start();
    }
}
