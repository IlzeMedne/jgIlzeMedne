package lv.homework.lesson9;

import java.util.*;

public class UniqueWordVocabulary {

    private Set<String> words = new HashSet<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void printToConsole() {
        System.out.println("Unique words: " + words);
    }

    public void printToConsoleInColumn() {
        System.out.println("Unique words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public int getUniqueWordsCount() {
        return words.size();
    }

    public static void main(String[] args) {

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("dog");
        uniqueWordVocabulary.addWord("elephant");
        uniqueWordVocabulary.addWord("lion");
        uniqueWordVocabulary.addWord("cat");
        uniqueWordVocabulary.addWord("dog");
        uniqueWordVocabulary.addWord("lion");

        System.out.println("Count of unique words: "
                + uniqueWordVocabulary.getUniqueWordsCount());

        uniqueWordVocabulary.printToConsole();

        uniqueWordVocabulary.addWord("fox");

        uniqueWordVocabulary.printToConsoleInColumn();

        // pati neatradu, bet iedomājos, vai ir iespējams izdrukāt consolē
        // visu saraktsu, ja tas veidots kā Set kolekcija (kas bija prasīts uzdevumā)
        // es domāju visus vārdus, ne tikai unikālos?
    }
}
