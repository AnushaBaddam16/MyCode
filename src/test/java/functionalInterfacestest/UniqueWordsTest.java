package functionalInterfacestest;


import functionalInterfaces.UniqueWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

public class UniqueWordsTest {

    @Test
    void testCountUniqueWordsForNonNullString() {
        String input = "java python c++ java python c#";
        HashMap<String, Integer> wordCountMap = UniqueWords.countUniqueWords(input);

        assertEquals(4, wordCountMap.size());
        assertEquals(2, wordCountMap.get("java"));
        assertEquals(2, wordCountMap.get("python"));
        assertEquals(1, wordCountMap.get("c++"));
        assertEquals(1, wordCountMap.get("c#"));
    }

    @Test
    void testCountUniqueWordsForEmptyString() {
        String input = "";
        HashMap<String, Integer> wordCountMap = UniqueWords.countUniqueWords(input);

        assertEquals(0, wordCountMap.size());
    }

    @Test
    void testCountUniqueWordsForNullString() {
        String input = null;
        HashMap<String, Integer> wordCountMap = UniqueWords.countUniqueWords(input);

        assertEquals(0, wordCountMap.size());
    }
}

