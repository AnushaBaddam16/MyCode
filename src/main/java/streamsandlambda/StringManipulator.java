package streamsandlambda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringManipulator {
    public String[] capitalizeAndPrintAlphabetically(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s != null ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : null)
                .sorted()
                .toArray(String[]::new);
    }
}