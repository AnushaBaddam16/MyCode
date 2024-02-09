package functionalInterfacestest;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import functionalInterfaces.HashSort;

public class HashSortTest {

    @Test
    public void testSortByValues() {
        // Create an unsorted map
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("John", 30);
        unsortedMap.put("Alice", 25);
        unsortedMap.put("Bob", 35);
        unsortedMap.put("Charlie", 28);

        // Call the method to be tested
        Map<String, Integer> sortedMap = HashSort.sortByValues(unsortedMap);

        // Expected sorted order based on values
        String[] expectedKeys = { "Bob", "John", "Charlie", "Alice" };
        int[] expectedValues = { 35, 30, 28, 25 };

        // Verify the sorted map
        int i = 0;
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            assertEquals(expectedKeys[i], entry.getKey());
            assertEquals(expectedValues[i], entry.getValue().intValue());
            i++;
        }
    }

    @Test
    public void testSortByValuesWithEmptyMap() {
        // Create an empty map
        Map<String, Integer> unsortedMap = new HashMap<>();

        // Call the method to be tested
        Map<String, Integer> sortedMap = HashSort.sortByValues(unsortedMap);

        // Verify the sorted map should also be empty
        assertEquals(0, sortedMap.size());
    }

    @Test
    public void testSortByValuesWithSingleEntry() {
        // Create a map with a single entry
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 25);

        // Call the method to be tested
        Map<String, Integer> sortedMap = HashSort.sortByValues(unsortedMap);

        // Verify the sorted map should have the single entry
        assertEquals(1, sortedMap.size());
        assertEquals("Alice", sortedMap.keySet().iterator().next());
        assertEquals(25, sortedMap.get("Alice").intValue());
    }
}
