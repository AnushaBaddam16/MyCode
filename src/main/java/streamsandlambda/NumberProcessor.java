package streamsandlambda;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {

    public List<Integer> doubleOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0) // Filter out odd numbers
                .map(n -> n * 2) // Double each remaining number
                .collect(Collectors.toList());
    }
}
