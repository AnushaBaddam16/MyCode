package functionalInterfacestest;

import functionalInterfaces.RepeatedCharacters;
import org.junit.jupiter.api.Test;

public class RepeatedCharactersTest {

    @Test
    void testIdentifyAndPrintRepeatedCharacters() {
        String input = "programming";
        System.out.println("Input String: " + input);
        RepeatedCharacters.identifyAndPrintRepeatedCharacters(input);
    }

    @Test
    void testIdentifyAndPrintRepeatedCharactersWithEmptyString() {
        String input = "";
        System.out.println("Input String: " + input);
        RepeatedCharacters.identifyAndPrintRepeatedCharacters(input);
    }

    @Test
    void testIdentifyAndPrintRepeatedCharactersWithNullString() {
        String input = null;
        System.out.println("Input String: " + input);
        RepeatedCharacters.identifyAndPrintRepeatedCharacters(input);
    }

    @Test
    void testIdentifyAndPrintRepeatedCharactersWithNoRepeats() {
        String input = "abcdef";
        System.out.println("Input String: " + input);
        RepeatedCharacters.identifyAndPrintRepeatedCharacters(input);
    }

    @Test
    void testIdentifyAndPrintRepeatedCharactersWithRepeatsAtEnd() {
        String input = "programminggg";
        System.out.println("Input String: " + input);
        RepeatedCharacters.identifyAndPrintRepeatedCharacters(input);
    }
}

