
// PRACTICE SET 11

// PROBLEM 1 : 
abstract class Pen {
    abstract void Write();

    abstract void refil();
}

// PROBLEM 2 :
class fountain extends Pen {
    void Write() {
        System.out.println("Writting...!");
    }

    void refil() {
        System.out.println("Refil...!");
    }

    void changeNib() {
        System.out.println("Changing Nib..!");
    }
}

// PROBLEM 3 :
class Monkey {
    void jump() {
        System.out.println("jumping..!");
    }

    void bite() {
        System.out.println("biting..!");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("spiking..!");
    }

    public void eat() {
        System.out.println("Eating..!");
    }

    public void sleep() {
        System.out.println("Slepping..!");
    }
}

// PROBLEM 4 :
abstract class Telphone2 {
    abstract void ring();

    abstract void left();

    abstract void disconnect();
}

class SmartPhone2 extends Telphone2 {
    public void ring() {
        System.out.println("Ringging..1");
    }

    public void left() {
        System.out.println("leftting..!");
    }

    public void disconnect() {
        System.out.println("Disconnected...!");
    }

    public void camera() {
        System.out.println("take photo..!");
    }

    void call1() {
        System.out.println("Calling..!");
    }
}

// PROBLRM 6 :
interface TVRemote {
    void changCannel();

    void increseVol();

    void deleteCannel();

    void playGame();
}

interface SmartTVRemote extends TVRemote {
    void repair();

    void signal();

    void channelNumber();
}

// PROBLEM 7 :
class TV implements TVRemote {
    public void changCannel() {
        System.out.println("change..!");
    }

    public void increseVol() {
        System.out.println("incresed..!");
    }

    public void deleteCannel() {
        System.out.println("DEleted..!");
    }

    public void playGame() {
        System.out.println("Playing..!");
    }
}

public class practice_set_11_lec_60 {
    public static void main(String[] args) {

        // PROBLEM 2 :
        // fountain fou = new fountain();
        // fou.changeNib();

        // PROBLEM 3 :
        // Human HM = new Human();
        // HM.eat();

        // PROBLEM 4 :
        Telphone2 tp = new SmartPhone2();
        // tp.camera(); // Generate error
        tp.disconnect();

        // PROBLEM 5 :
        // Monkey mon = new Human();
        // mon.jump();

        // PROBLEM 6 & 7 :
        TV t1 = new TV();
        t1.changCannel();
    }
}