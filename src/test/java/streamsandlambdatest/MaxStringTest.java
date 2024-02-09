package streamsandlambdatest;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import streamsandlambda.MaxString;

public class MaxStringTest {

    @Test
    public void testFindMaxElement() {
        List<String> var = Arrays.asList("Oregon", "Florida", "Georgia");
        assertEquals("Oregon", MaxString.findMaxElement(var));
    }

    @Test
    public void testFindMaxElementWithNullElement() {
        List<String> var = new ArrayList<>(Collections.singletonList(null));
        assertEquals(null, MaxString.findMaxElement(var));
    }

    @Test
    public void testFindMaxElementWithEmptyList() {
        List<String> var = new ArrayList<>();
        assertEquals(null, MaxString.findMaxElement(var));
    }

    @Test
    public void testFindMaxElementWithSingleElement() {
        List<String> var = Arrays.asList("Single");
        assertEquals("Single", MaxString.findMaxElement(var));
    }

    @Test
    public void testFindMaxElementWithAllEqualElements() {
        List<String> var = Arrays.asList("Equal", "Equal", "Equal");
        assertEquals("Equal", MaxString.findMaxElement(var));
    }
}
