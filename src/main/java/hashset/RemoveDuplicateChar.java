package hashset;
import java.util.HashSet;
public class RemoveDuplicateChar {
    public static String removeDuplicates(String input) {
        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

}
