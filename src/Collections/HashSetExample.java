package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(null);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(10);

        System.out.println("Hahset values are: "+hashSet);
    }
}
