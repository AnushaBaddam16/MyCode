package hashsettest;
import hashset.HashSetIterator;
import org.junit.Test;
import java.util.HashSet;

public class HashsetTest {
    @Test
    public void testSetIterations(){
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Telugu");
        stringSet.add("Hindi");
        stringSet.add("English");
        stringSet.add("Maths");
        stringSet.add("Science");
        stringSet.add("Social");
        stringSet.add("Physics");
        stringSet.add("Biology");
        stringSet.add("Sanskrit");
        stringSet.add("Spanish");
        HashSetIterator.setUsingIterator(stringSet);
        HashSetIterator.setUsingForLoop(stringSet);
        HashSetIterator.setUsingEnhanced(stringSet);


    }
}