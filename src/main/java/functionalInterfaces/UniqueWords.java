package functionalInterfaces;

import java.util.HashMap;

public class UniqueWords {

    public static HashMap<String, Integer> countUniqueWords(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("String is null or empty. No unique words.");
            return new HashMap<>();
        }

        String[] words = input.split("\\s+"); // Split the string into words using whitespace as a delimiter
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Update the count in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
