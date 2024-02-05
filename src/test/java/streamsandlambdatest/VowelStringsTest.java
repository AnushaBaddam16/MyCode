package streamsandlambdatest;

import org.junit.Test;
import streamsandlambda.VowelStrings;

import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VowelStringsTest{

    @Test
    public void testCountVowels() {
        String[] strings = {"hello", "world", "java", "programming"};

        Map<String, Long> result = VowelStrings.countVowelsInStrings(strings);

        assertEquals(2, (long) result.get("hello"));
        assertEquals(1, (long) result.get("world"));
        assertEquals(2, (long) result.get("java"));
        assertEquals(3, (long) result.get("programming"));
    }

    @Test
    public void testCountVowelsEmptyArray() {
        String[] strings = {};

        Map<String, Long> result = VowelStrings.countVowelsInStrings(strings);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testCountVowelsInStringsNullString() {
        String[] strings = {null};
        Map<String, Long> result = VowelStrings.countVowelsInStrings(strings);

        assertTrue(result.containsKey(null));
        assertEquals(0, (long) result.get(null));
    }
}
