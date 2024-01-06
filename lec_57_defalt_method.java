
//  DEFAULT METHOD 

/**
 * @author Mitesh_coder
 * @version 7.7
 * @since 7.5
 */
interface MyCamera {
    /**
     * represent takesnap method
     */
    void takeSnap();

    /**
     * Represent record video method
     */
    void recordVideo();

    /**
     * default method
     */
    default void record4K() {
        System.out.println("I am default ,no need to implement me..!");
    }
}

interface MyWifi {
    void connecToNetwork(String network);

    String[] getNetwork();
}

class MyCellPhone {

    // private modifier
    private void greet() {
        System.out.println("I am Private modifier so i cann't exit out of this class...!!");
    }

    /**
     * @param number
     */

    // private modifier can call only PUBLIC presented class
    void callNumber(int number) {
        greet(); // calling private class
        System.out.println("calling " + number);
    }

    void pickCall() {
        System.out.println("Connecting..");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
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

public class lec_57_defalt_method {
    public static void main(String[] args) {

        MySmartPhone sm = new MySmartPhone();
        /*
         * sm.takeSnap();
         * sm.callNumber(7);
         * sm.record4K();
         * sm.greet();---> generate error
         */

        MyCellPhone mc = new MyCellPhone();
        mc.callNumber(52);

        String[] str = sm.getNetwork();
        for (String s : str) {
            System.out.println(s);
        }
    }
}