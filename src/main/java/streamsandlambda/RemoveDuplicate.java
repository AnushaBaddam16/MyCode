package streamsandlambda;
import java.util.List;
        import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static List<Integer> removeDuplicates(List<Integer> duplicate) {
        return duplicate.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}