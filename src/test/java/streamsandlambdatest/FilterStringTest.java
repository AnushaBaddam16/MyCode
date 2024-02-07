package streamsandlambdatest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import java.util.Arrays;
import java.util.List;
import streamsandlambda.FilterString;

public class FilterStringTest {

    FilterString str = new FilterString();

    @Test
    public void testStringsTrueCase() {
        List<String> givenlist = Arrays.asList("Arizona","Texas", "Allen");
        List<String> expectedListOutput = Arrays.asList("Arizona", "Allen");
        assertEquals(expectedListOutput, str.filterListStrings(givenlist, s -> s.startsWith("A")));
    }

    @Test
    public void testStringsFalseCase() {
        List<String> givenlist = Arrays.asList("Arizona","Texas", "Allen");
        List<String> expectedListOutput = Arrays.asList("Allen");
        assertNotSame(expectedListOutput, str.filterListStrings(givenlist, s -> s.startsWith("A")));
    }

    @Test
    public void testStringsNullCase() {
        List<String> givenlist = Arrays.asList();
        List<String> expectedListOutput = Arrays.asList();
        assertEquals(expectedListOutput, str.filterListStrings(givenlist, s -> s.startsWith("A")));
    }
}
