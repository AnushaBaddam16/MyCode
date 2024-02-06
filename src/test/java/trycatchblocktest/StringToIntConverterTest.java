package trycatchblocktest;
import org.junit.Test;
import trycatchblock.StringToIntConverter;
import static org.junit.Assert.assertEquals;

public class StringToIntConverterTest {

    @Test
    public void testConvertToIntWithValidInput() {
        StringToIntConverter converter = new StringToIntConverter();
        int result = converter.convertToInt("23");
        assertEquals(23, result);
    }

    @Test
    public void testConvertToIntWithDecimalInput() {
        StringToIntConverter converter = new StringToIntConverter();
        int result = converter.convertToInt("45.67");
        assertEquals(-1, result); // Expecting -1 as it's not a valid integer
    }

    @Test
    public void testConvertToIntWithNonNumericInput() {
        StringToIntConverter converter = new StringToIntConverter();
        int result = converter.convertToInt("test");
        assertEquals(-1, result); // Expecting -1 as it's not a valid integer
    }

    @Test
    public void testConvertToIntWithAlphaNumericInput() {
        StringToIntConverter converter = new StringToIntConverter();
        int result = converter.convertToInt("123f");
        assertEquals(-1, result); // Expecting -1 as it's not a valid integer
    }
}

