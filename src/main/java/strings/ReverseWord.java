package strings;

public class ReverseWord {

    // Method to reverse each word in a sentence
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Join the reversed words back into a sentence
        return String.join(" ", words);
    }

    // Method to reverse a single word
    public static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the characters in the word
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}
