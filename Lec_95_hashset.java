
// HASHSET


import java.util.HashSet;

public class Lec_95_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhaset = new HashSet<>(); // by default 16 element capacity of these
         
        myhaset.add(85);
        myhaset.add(9);
        myhaset.add(75);
        myhaset.add(43);
        myhaset.add(91);
        myhaset.add(462);

        System.out.println(myhaset);
        System.out.println(myhaset.clone());

        // similar for arraylist collection 
    }
}
