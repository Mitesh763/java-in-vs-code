
// COLLECTION FRAMWORKS   --->   ARRAYLIST

import java.util.*;

public class Lec_91_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(); // create an arraylist object of integer types
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(85);
        l1.add(95);
        l1.add(45);
        l1.add(40);
        l1.add(77);
        l1.add(45);
        l1.add(67);

        l2.add(5);
        l2.add(7);
        l2.add(9);
        l2.add(4);

        // print elements in array
        System.out.print("[ ");
        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j));
            System.out.print(" ");
        }
        System.out.println("]");

        // removing element
        l1.remove(5);

        // specific element included in array or not
        System.out.println(l2.contains(7));

        // merge array 
        System.out.println("l1 array contain : " + l1);
        System.out.println("l1 array contain : " + l2);
        l1.addAll(l2);
        System.out.println("After merging l1 array contain : " + l1);
        System.out.println("l1 array contain : " + l2);

        // index of perticular element 
        System.out.println("index of " + l2.get(2) + " is : " + l2.indexOf(9));
    }
}