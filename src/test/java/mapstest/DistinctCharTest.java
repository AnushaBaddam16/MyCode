package mapstest;
import org.junit.Test;
import static org.junit.Assert.*;

import maps.DistinctChar;

import java.util.HashMap;
import java.util.Optional;

public class DistinctCharTest {

    @Test
    public void testDistinctWithDifferentCharacters() {
        DistinctChar val = new DistinctChar();

        // True case
        HashMap<Character, Integer> charcount = val.differentOccur("Ssai");
        assertEquals(2, charcount.get('s').intValue());
        assertEquals(1, charcount.get('a').intValue());
        assertEquals(1, charcount.get('i').intValue());
    }

    @Test
    public void testDistinctWithSpace() {
        DistinctChar val = new DistinctChar();

        // True case with space
        HashMap<Character, Integer> charcount2 = val.differentOccur("S sai");
        assertEquals(2, charcount2.get('s').intValue());
        assertEquals(1, charcount2.get('a').intValue());
        assertEquals(1, charcount2.get('i').intValue());
        assertNotEquals(Optional.of(1), charcount2.get(' '));
    }

    @Test
    public void testDistinctWithDifferentCount() {
        DistinctChar val = new DistinctChar();

        // False case
        HashMap<Character, Integer> charcount3 = val.differentOccur("Ssai");
        assertNotEquals(1, charcount3.get('s').intValue());
        assertEquals(1, charcount3.get('a').intValue());
        assertEquals(1, charcount3.get('i').intValue());
    }

    @Test
    public void testDistinctWithEmptyString() {
        DistinctChar val = new DistinctChar();

        // Null case
        HashMap<Character, Integer> charnull = val.differentOccur("");
        assertNull(charnull.get(' '));
    }
}
