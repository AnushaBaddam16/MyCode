package functionalInterfacestest;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import functionalInterfaces.ReverseList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseListTest {

    @Test
    void testReverseList() {
        // Test case for reversing a non-empty list
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        ReverseList reverseList = new ReverseList();
        ArrayList<String> reversedList = reverseList.reverseList(inputList);

        ArrayList<String> expectedReversedList = new ArrayList<>(Arrays.asList("orange", "banana", "apple"));
        assertEquals(expectedReversedList, reversedList);
    }

    @Test
    void testReverseEmptyList() {
        // Test case for reversing an empty list
        ArrayList<String> emptyList = new ArrayList<>();
        ReverseList reverseList = new ReverseList();
        ArrayList<String> reversedEmptyList = reverseList.reverseList(emptyList);

        assertTrue(reversedEmptyList.isEmpty());
    }

    @Test
    void testReverseNullList() {
        // Test case for reversing a null list
        ReverseList reverseList = new ReverseList();
        ArrayList<String> reversedNullList = reverseList.reverseList(null);

        assertNull(reversedNullList);
    }

    @Test
    void testReverseListWithNullElement() {
        // Test case for reversing a list with null element (should not reverse)
        ArrayList<String> listWithNull = new ArrayList<>(Arrays.asList("apple", null, "orange"));
        ReverseList reverseList = new ReverseList();
        ArrayList<String> reversedListWithNull = reverseList.reverseList(listWithNull);

        ArrayList<String> expectedListWithNull = new ArrayList<>(Arrays.asList("apple", null, "orange"));
        assertEquals(expectedListWithNull, reversedListWithNull);
    }
}
