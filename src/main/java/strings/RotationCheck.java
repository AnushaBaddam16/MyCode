package strings;

public class RotationCheck {


    public static void main(String[] args) {
        // Example strings
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        // Check if str2 is a rotation of str1
        boolean result = isRotation(str1, str2);

        // Display the result
        System.out.println("Output: " + result);
    }

    // Method to check if one string is a rotation of another
    public static boolean isRotation(String s1, String s2) {
        // Check if both strings have the same length and are not empty
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
    }
}
