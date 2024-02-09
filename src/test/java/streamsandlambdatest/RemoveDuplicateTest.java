package streamsandlambdatest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import streamsandlambda.RemoveDuplicate;

public class RemoveDuplicateTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> vals = Arrays.asList(1, 1, 2, 3, 100, 3, 35);
        List<Integer> compvals = Arrays.asList(1, 2, 3, 100, 35);
        assertEquals(compvals, RemoveDuplicate.removeDuplicates(vals));
    }

    @Test
    public void testRemoveDuplicatesWithFalseComparison() {
        List<Integer> vals = Arrays.asList(1, 1, 2, 3, 100, 3, 35);
        List<Integer> compvals = Arrays.asList(1, 2, 3, 35, 100);
        assertNotSame(compvals, RemoveDuplicate.removeDuplicates(vals));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> vals = Arrays.asList();
        List<Integer> compvals = Arrays.asList();
        assertNotSame(compvals, RemoveDuplicate.removeDuplicates(vals));
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        List<Integer> vals = Arrays.asList(42);
        List<Integer> compvals = Arrays.asList(42);
        assertEquals(compvals, RemoveDuplicate.removeDuplicates(vals));
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> vals = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> compvals = Arrays.asList(5);
        assertEquals(compvals, RemoveDuplicate.removeDuplicates(vals));
    }
}

