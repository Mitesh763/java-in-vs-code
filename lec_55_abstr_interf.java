
//ABSTRACT CLASSES v/s INTERFACE:

interface Bicycle {
    void Breack(int decrement);
    void Speedup(int increment);
}

interface Horn{
    void blowhorn();
    void friqu();
}

class AvonCycle implements Bicycle,Horn {
    public void Breack(int decrement) {
        System.out.println("Applying breack");
    }

    public void Speedup(int increment) {
        System.out.println("Increase speed..!");
    }

    public void blowhorn() {
        System.out.println("pee pee pee pee");
    }
    public void friqu(){
        System.out.println("High Frequncy...!");
    }
}

public class lec_55_abstr_interf {
    public static void main(String[] args) {
            
        AvonCycle obj1 = new AvonCycle();
        obj1.Breack(7);
        obj1.blowhorn();
    }
}