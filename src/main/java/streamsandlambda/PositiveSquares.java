package streamsandlambda;

import java.util.Arrays;
import java.util.List;
public class PositiveSquares {
    public static int calculatePositiveSumSquares(List<Integer> numbers) {
        return  numbers.stream()
                .filter(num -> num > 0)
                .mapToInt(num -> num * num)
                .sum();
    }
}