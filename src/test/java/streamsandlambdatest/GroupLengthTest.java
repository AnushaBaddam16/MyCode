package streamsandlambdatest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import streamsandlambda.GroupLength;

public class GroupLengthTest {

    @Test
    public void testGroupByLength() {
        List<String> inputStrings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");
        Map<Integer, List<String>> result = GroupLength.groupByLength(inputStrings);

        // Check if all groups are present
        assertTrue(result.containsKey(4));
        assertTrue(result.containsKey(5));
        assertTrue(result.containsKey(6));

        // Check the sizes of each group
        assertEquals(2, result.get(4).size());
        assertEquals(2, result.get(5).size());
        assertEquals(2, result.get(6).size());
    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        List<String> inputStrings = Arrays.asList();
        Map<Integer, List<String>> result = GroupLength.groupByLength(inputStrings);

        // The result should be empty
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGroupByLengthWithSingleElement() {
        List<String> inputStrings = Arrays.asList("apple");
        Map<Integer, List<String>> result = GroupLength.groupByLength(inputStrings);

        // There should be one group with size 5
        assertTrue(result.containsKey(5));
        assertEquals(1, result.get(5).size());
    }

    @Test
    public void testGroupByLengthWithDuplicateStrings() {
        List<String> inputStrings = Arrays.asList("apple", "banana", "apple", "kiwi");
        Map<Integer, List<String>> result = GroupLength.groupByLength(inputStrings);

        // Check if all groups are present
        assertTrue(result.containsKey(5));
        assertTrue(result.containsKey(6));

        // Check the sizes of each group
        assertEquals(2, result.get(5).size());
        assertEquals(1, result.get(6).size());
    }
}

