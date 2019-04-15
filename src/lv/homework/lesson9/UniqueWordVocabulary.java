package lv.homework.lesson9;

import java.util.*;

//nepieciešams šeit izveidot metodes addWord, getUniqueWords, printToConsole
//tad šīs metodes pārbaudīt te pat main metodē
public class UniqueWordVocabulary {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>();

        words.add("dog");
        words.add("elephant");
        words.add("monkey");
        words.add("rat");
        words.add("lion");
        words.add("cat");
        words.add("dog");
        words.add("mouse");
        words.add("lion");
        words.add("fox");
        words.add("wolf");

        System.out.println("Count of unique words: " + words.size());
        System.out.println("Set: " + words);

        // īsti nesaprotu, kas uzdevumā ir prasīts.
        // Set parāda un skaita tikai unikālās vērtības.
        // vai tiešām tas bija viss, kas te jādara un jāsaprot?
        // vai to printēšanu un skaitīšanu pārtaisīt kā metodes?
    }
}
