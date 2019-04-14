package lv.homework.lesson9;

import java.util.HashSet;
import java.util.Set;

public class OperationsWithSet {
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        integers.add(3);
        integers.add(1);
        integers.add(5);

        System.out.println("Size: " + integers.size());
        System.out.println("Set: " + integers);
        System.out.println("Remove number 3: " + integers.remove(3));
        System.out.println("Set: " + integers);
        System.out.println("Contains number 3: " + integers.contains(3));
        System.out.println("Contains number 5: " + integers.contains(5));
    }
}
