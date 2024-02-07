package streamsandlambdatest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import streamsandlambda.ArrayOrderSort;
import java.util.Arrays;
import java.util.List;

public class ArrayOrderSortTest {

    @Test
    public void testSortBasedOnLengthNotEmpty() {
        ArrayOrderSort arrayOrderSort = new ArrayOrderSort();

        // Test case: Check if the method correctly sorts an array of strings
        String[] inputArray1 = {"chinnI", "anushA", "janu", "anu", "anvesh", "reddy"};
        List<String> result1 = arrayOrderSort.sortBasedOnLength(inputArray1);
        List<String> expected1 = Arrays.asList("anu",  "janu", "reddy", "anvesh", "chinnI","anushA");
        assertEquals(expected1, result1);
    }

    @Test
    public void testSortBasedOnLengthEmpty() {
        ArrayOrderSort arrayOrderSort = new ArrayOrderSort();

        // Test case: Check if the method handles an empty array
        String[] inputArray2 = {};
        List<String> result2 = arrayOrderSort.sortBasedOnLength(inputArray2);
        assertTrue(result2.isEmpty());
    }
}
