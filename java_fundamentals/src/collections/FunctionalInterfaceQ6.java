package collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalInterfaceQ6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elder");

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String original = list.get(i);
                String reversed = new StringBuilder(original).reverse().toString();
                list.set(i, reversed);
            }
        };

        reverseWords.accept(words);  // Apply consumer
        System.out.println("Reversed words: " + words);
    }
}

