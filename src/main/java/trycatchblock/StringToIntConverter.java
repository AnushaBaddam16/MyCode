package trycatchblock;

public class StringToIntConverter {
    public int convertToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            return -1; // Or any other default value indicating an error
        }
    }
}
