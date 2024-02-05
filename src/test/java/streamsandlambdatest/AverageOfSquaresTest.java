package streamsandlambdatest;

import org.junit.Test;
import streamsandlambda.AverageOfSquares;
import static org.junit.Assert.assertEquals;

public class AverageOfSquaresTest {

    @Test
    public void testCalculateAverageOfSquaresOfOddNumbers() {
        AverageOfSquares averageOfSquares = new AverageOfSquares();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Expected result: ((1^2 + 3^2 + 5^2 + 7^2 + 9^2) / 5) = 165 / 5 = 11.0
        assertEquals(33.0, result, 0.01);
    }

    @Test
    public void testCalculateAverageOfSquaresOfOddNumbersWithNoOddNumbers() {
        AverageOfSquares averageOfSquares = new AverageOfSquares();

        int[] numbers = {2, 4, 6, 8};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Expected result: No odd numbers, so the average is 0.0
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void testCalculateAverageOfSquaresOfOddNumbersWithEmptyArray() {
        AverageOfSquares averageOfSquares = new AverageOfSquares();

        int[] numbers = {};

        double result = averageOfSquares.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Expected result: Empty array, so the average is 0.0
        assertEquals(0.0, result, 0.01);
    }
}
