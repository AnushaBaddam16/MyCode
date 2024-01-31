package functionalInterfacestest;

import functionalInterfaces.ArraySum;
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

public class ArraySumTest {

    @Test
    void testCalculateArraySumForNonNullArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = ArraySum.calculateArraySum(array);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testCalculateArraySumForEmptyArray() {
        int[] array = {};
        int expectedSum = 0;
        int actualSum = ArraySum.calculateArraySum(array);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testCalculateArraySumForNullArray() {
        int[] array = null;
        int expectedSum = 0;
        int actualSum = ArraySum.calculateArraySum(array);
        assertEquals(expectedSum, actualSum);
    }
}



