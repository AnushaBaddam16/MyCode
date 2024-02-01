package functionalInterfaces;
    public class CaseConverter {

        public static String swapCase(String input) {
            if (input == null) {
                return null;
            }

            char[] chars = input.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char currentChar = chars[i];

                if (Character.isUpperCase(currentChar)) {
                    chars[i] = Character.toLowerCase(currentChar);
                } else if (Character.isLowerCase(currentChar)) {
                    chars[i] = Character.toUpperCase(currentChar);
                }
            }

            return new String(chars);
        }
    }

