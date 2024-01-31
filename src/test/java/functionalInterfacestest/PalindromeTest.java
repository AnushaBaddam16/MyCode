package functionalInterfacestest;

import functionalInterfaces.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testIsPalindromeForPalindromeNumber() {
        assertTrue(Palindrome.isPalindrome(121));
    }

    @Test
    void testIsPalindromeForNonPalindromeNumber() {
        assertFalse(Palindrome.isPalindrome(12345));
    }

    @Test
    void testIsPalindromeForZero() {
        assertTrue(Palindrome.isPalindrome(0));
    }

    @Test
    void testIsPalindromeForNegativeNumber() {
        assertFalse(Palindrome.isPalindrome(-121));
    }

    }
