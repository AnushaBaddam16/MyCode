package streamsandlambdatest;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import streamsandlambda.PositiveSquares;

public class PositiveSquaresTest {

    @Test
    public void testCalculatePositiveSumSquares() {
        List<Integer> nums = Arrays.asList(3, 4, 1, 5, 6);
        assertEquals(87, PositiveSquares.calculatePositiveSumSquares(nums));
    }

    @Test
    public void testCalculatePositiveSumSquaresWithZero() {
        List<Integer> nums = Arrays.asList(0);
        assertEquals(0, PositiveSquares.calculatePositiveSumSquares(nums));
    }

    @Test
    public void testCalculatePositiveSumSquaresWithNegativeNumbers() {
        List<Integer> nums = Arrays.asList(-1, -2, -3);
        assertEquals(0, PositiveSquares.calculatePositiveSumSquares(nums));
    }

    @Test
    public void testCalculatePositiveSumSquaresWithEmptyList() {
        List<Integer> nums = Arrays.asList();
        assertEquals(0, PositiveSquares.calculatePositiveSumSquares(nums));
    }

    @Test
    public void testCalculatePositiveSumSquaresWithAllPositiveNumbers() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(55, PositiveSquares.calculatePositiveSumSquares(nums));
    }
}
