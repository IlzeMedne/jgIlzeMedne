package lv.homework.lesson9;


import java.util.ArrayList;
import java.util.List;

public class OperationsWithList {

    public static void main(String[] args) {

        List<String> alphabet = new ArrayList<>();

        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");

        System.out.println("List: " + alphabet);
        System.out.println("Get from list: " + alphabet.get(2));
        System.out.println("Size: " + alphabet.size());
        System.out.println("Remove \"A\": " + alphabet.remove("A"));
        System.out.println("List: " + alphabet);
        System.out.println("Remove index 0: " + alphabet.remove(0));
        System.out.println("List: " + alphabet);
    }
}
