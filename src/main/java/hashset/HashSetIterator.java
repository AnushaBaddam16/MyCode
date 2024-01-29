package hashset;
import java.util.Iterator;
import java.util.HashSet;
public class HashSetIterator {

    // Create a HashSet of Strings

    public static void setUsingIterator(HashSet<String> stringSet) {
        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }



    // Iterate using for loop
    public static void setUsingForLoop(HashSet<String> stringSet) {
        System.out.println("\nIterating using for loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }
    }

    public static void setUsingEnhanced(HashSet<String> stringSet) {
        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            String element = (String) stringArray[i];
            System.out.println(element);
        }
    }

}
