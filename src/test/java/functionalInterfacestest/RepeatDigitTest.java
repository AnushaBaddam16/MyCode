package functionalInterfacestest;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import  functionalInterfaces.RepeatDigit;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatDigitTest {

    @Test
    void testRepeatDigitsWithRepeats() {
        // Test case for an input number with repeated digits
        RepeatDigit repeatDigit = new RepeatDigit();
        int inputNumber = 122354732;
        List<Integer> repeatedDigits = repeatDigit.repeatDigits(inputNumber);

        List<Integer> expectedRepeats = Arrays.asList(2, 3);
        assertEquals(expectedRepeats, repeatedDigits);
    }

    @Test
    void testRepeatDigitsWithNoRepeats() {
        // Test case for an input number with no repeated digits
        RepeatDigit repeatDigit = new RepeatDigit();
        int inputNumber = 123456789;
        List<Integer> repeatedDigits = repeatDigit.repeatDigits(inputNumber);

        assertTrue(repeatedDigits.isEmpty());
    }

    @Test
    void testRepeatDigitsWithSingleDigit() {
        // Test case for an input number with only one digit
        RepeatDigit repeatDigit = new RepeatDigit();
        int inputNumber = 7;
        List<Integer> repeatedDigits = repeatDigit.repeatDigits(inputNumber);

        assertTrue(repeatedDigits.isEmpty());
    }

    @Test
    void testRepeatDigitsWithZero() {
        // Test case for an input number with zero
        RepeatDigit repeatDigit = new RepeatDigit();
        int inputNumber = 102030;
        List<Integer> repeatedDigits = repeatDigit.repeatDigits(inputNumber);

        List<Integer> expectedRepeats = Arrays.asList(0);
        assertEquals(expectedRepeats, repeatedDigits);
    }
}
