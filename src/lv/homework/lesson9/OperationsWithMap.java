package lv.homework.lesson9;

import java.util.HashMap;
import java.util.Map;

public class OperationsWithMap {
    public static void main(String[] args) {
        Map<Integer, String> numbersAndWords = new HashMap<>();

        numbersAndWords.put(100, "One hundred");
        numbersAndWords.put(1000, "One thousand");
        numbersAndWords.put(5, "Five");
        numbersAndWords.put(10, "Ten");

        System.out.println("Map: " + numbersAndWords);
        System.out.println("Size: " + numbersAndWords.size());
        System.out.println("Get by key 5: " + numbersAndWords.get(5));
        System.out.println("Get by key 13: " + numbersAndWords.get(13));
        System.out.println("Remove key 10: " + numbersAndWords.remove(10));
        System.out.println("Map: " + numbersAndWords);
        System.out.println("Keys: " + numbersAndWords.keySet());
        System.out.println("Contains 100: " + numbersAndWords.containsKey(100));
        System.out.println("Contains value Five: " + numbersAndWords.containsValue("Five"));
        System.out.println("Values: " + numbersAndWords.values());
    }
}