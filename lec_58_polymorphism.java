
// POLYMORPHISM



interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    default void record4K() {
        System.out.println("I am default ,no need to implement me..!");
    }
}

interface MyWifi2 {
    void connecToNetwork(String network);

    String[] getNetwork();
}

class MyCellPhone2 {

    // private modifier 
    private void greet() {
        System.out.println("I am Private modifier so i cann't exit out of this class...!!");
    }

    // private modifier can call only PUBLIC presented class
    void callNumber(int number) {
        greet();    // calling private class 
        System.out.println("calling " + number);
    }

    void pickCall() {
        System.out.println("Connecting..");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    void callNumber(int no) {
        System.out.println(" loading in call ..!");
    }

    public void takeSnap() {
        System.out.println("Tacking Snap ..!");
    }

    public void recordVideo() {
        System.out.println("Video recoreded..!");
    }

    // public void record4K() {
    // System.out.println("4K vedio..!");
    // }

    public void connecToNetwork(String network) {
        System.out.println("Connecting .. " + network);
    }

    public String[] getNetwork() {
        System.out.println("Getting list of Network...!");
        String[] netWorklist = { "mitesh", "jaypal", "rudra" };
        return netWorklist;
    }
}

public class lec_58_polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam1 =new MySmartPhone2();
         
        cam1.takeSnap();  // VALID 
      //  cam1.getNetwork();  //INVALID


      // WHIELE ALL METHODS
      MySmartPhone2 SM2 =new MySmartPhone2();
      SM2.getNetwork();
      SM2.callNumber(541);
    }
}