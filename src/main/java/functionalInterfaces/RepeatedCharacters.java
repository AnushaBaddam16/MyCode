package functionalInterfaces;

public class RepeatedCharacters {

    public static void identifyAndPrintRepeatedCharacters(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("String is null or empty. No repeated characters.");
            return;
        }

        char[] characters = input.toCharArray();
        System.out.print("Repeated characters: ");

        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[i] + " ");
                    break; // Avoid printing the same character multiple times
                }
            }
        }

        System.out.println();
    }
}

