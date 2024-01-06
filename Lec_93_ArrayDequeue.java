
// ARRAYDEQUEUE 


import java.util.*;

public class Lec_93_ArrayDequeue {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(48);
        ad1.add(93);
        ad1.add(11);
        ad1.add(52);
        ad1.add(77);
        ad1.add(77);

        ad2.add(9);
        ad2.add(7);
        ad2.add(3);

        System.out.println(ad1);

        System.out.println(ad1.hashCode());

        System.out.println(ad2.remove(7));
        System.out.println(ad2);
        System.out.println(ad1.size());
        System.out.println(ad1.toArray());
        // similar for array list collection
    }
}
