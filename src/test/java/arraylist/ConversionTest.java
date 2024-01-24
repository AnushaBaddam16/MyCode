package arraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConversionTest {
    @Test
    public void testArrayListToArrayConversion() {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        String[] expectedArray = {"apple", "banana", "cherry"};

        Conversion ArrayListToArrayConverter = null;
        String[] resultArray = ArrayListToArrayConverter.convertToArray(inputList);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testEmptyArrayListToArrayConversion() {
        ArrayList<String> inputList = new ArrayList<>();
        String[] expectedArray = {};

        Conversion ArrayListToArrayConverter = null;
        String[] resultArray = ArrayListToArrayConverter.convertToArray(inputList);

        assertArrayEquals(expectedArray, resultArray);
    }
}