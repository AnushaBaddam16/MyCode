package functionalInterfacestest;

import functionalInterfaces.SwapValues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwapValuesTest {

    @Test
    void testSwapForTrue() {
        int[] values = {5, 10};
        SwapValues.swap(values);
        assertArrayEquals(new int[]{10, 5}, values);
    }

    @Test
    void testSwapForFalse() {
        int[] values = {5, 10};
        SwapValues.swap(values);
        assertArrayEquals(new int[]{5, 10}, values);
    }

    @Test
    void testSwapForNull() {
        assertThrows(IllegalArgumentException.class, () -> SwapValues.swap(null));
    }
}
