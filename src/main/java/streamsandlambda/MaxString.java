package streamsandlambda;

import java.util.List;
import static java.util.Objects.isNull;
public class MaxString {
    public static String findMaxElement(List<String> strings) {
        strings.removeIf(s -> s == null);

        // Check if the list is empty
        if (strings.isEmpty()) {
            return null; // Return null if the list is empty
        }
        // Find the max element using natural order
        return strings.stream()
                .max(String::compareTo)
                .orElse(null);
    }
}
