package functionalInterfaces;

public class StringRotation {

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }
}
