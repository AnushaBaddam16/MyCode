package functionalInterfacestest;

import functionalInterfaces.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testCalculateFactorialForPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = Factorial.calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialForZero() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = Factorial.calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialForNegativeNumber() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(number));
    }
}
