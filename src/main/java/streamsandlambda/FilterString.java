package streamsandlambda;

import java.util.List;
        import java.util.function.Predicate;
        import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filterListStrings(List<String> strings, Predicate<String> condition) {
        return strings.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}