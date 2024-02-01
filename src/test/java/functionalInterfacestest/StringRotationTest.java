package functionalInterfacestest;

import functionalInterfaces.StringRotation;
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

public class StringRotationTest {

    @Test
    void testIsRotationForTrue() {
        String str1 = "abcd";
        String str2 = "cdab";
        assertTrue(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForFalseDifferentLength() {
        String str1 = "abcd";
        String str2 = "abcde";
        assertFalse(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForFalseNotRotation() {
        String str1 = "abcd";
        String str2 = "bdca";
        assertFalse(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForNullString1() {
        String str1 = null;
        String str2 = "cdab";
        assertFalse(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForNullString2() {
        String str1 = "abcd";
        String str2 = null;
        assertFalse(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForNullStrings() {
        String str1 = null;
        String str2 = null;
        assertFalse(StringRotation.isRotation(str1, str2));
    }

    @Test
    void testIsRotationForEmptyString() {
        String str1 = "";
        String str2 = "";
        assertTrue(StringRotation.isRotation(str1, str2));
    }
}
