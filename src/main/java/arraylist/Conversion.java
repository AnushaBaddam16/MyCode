package arraylist;

import java.util.ArrayList;
        import java.util.Arrays;

public class Conversion {

    public static String[] convertToArray(ArrayList<String> arrayList) {
        // Convert ArrayList to Array
        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);
        return stringArray;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));

        // Convert ArrayList to Array
        String[] resultArray = convertToArray(stringList);

        // Print the result
        System.out.println("ArrayList converted to Array: " + Arrays.toString(resultArray));
    }
}