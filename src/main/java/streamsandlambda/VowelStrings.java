package streamsandlambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class VowelStrings {
    public static Map<String, Long> countVowelsInStrings(String[] strings) {
        Map<String, Long> result = new HashMap<>();
        Arrays.stream(strings)
                .forEach(str -> result.put(str, countVowels(str)));
        return result;
    }
    private static long countVowels(String str) {
        if(str == null)
            return 0;
        return str.toLowerCase().chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }
}
