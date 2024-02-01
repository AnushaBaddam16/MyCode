package functionalInterfacestest;

import functionalInterfaces.CaseConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseConverterTest {

    @Test
    void testSwapCaseForMixedCase() {
        String input = "Hello World!";
        String result = CaseConverter.swapCase(input);
        assertEquals("hELLO wORLD!", result);
    }

    @Test
    void testSwapCaseForAllUpperCase() {
        String input = "HELLO";
        String result = CaseConverter.swapCase(input);
        assertEquals("hello", result);
    }

    @Test
    void testSwapCaseForAllLowerCase() {
        String input = "hello";
        String result = CaseConverter.swapCase(input);
        assertEquals("HELLO", result);
    }

    @Test
    void testSwapCaseForEmptyString() {
        String input = "";
        String result = CaseConverter.swapCase(input);
        assertEquals("", result);
    }

    @Test
    void testSwapCaseForNullString() {
        String input = null;
        String result = CaseConverter.swapCase(input);
        assertNull(result);
    }

    @Test
    void testSwapCaseForSpecialCharacters() {
        String input = "!@#$%^&*()";
        String result = CaseConverter.swapCase(input);
        assertEquals("!@#$%^&*()", result);
    }
}

