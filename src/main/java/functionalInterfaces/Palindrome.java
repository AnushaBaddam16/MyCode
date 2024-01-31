package functionalInterfaces;

public class Palindrome {

        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            return originalNumber == reversedNumber;
        }
    }

