package streamsandlambda;

import java.util.Arrays;

public class AverageOfSquares {

    public double calculateAverageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0.0);
    }
}
