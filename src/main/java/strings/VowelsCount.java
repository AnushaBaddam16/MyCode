package strings;
import java.util.Scanner;

public class VowelsCount {

    // Method to count vowels in a string
        public static int countVowels(String inputString){
            int vowelCount = 0 ;
            if(inputString ==  null)
                return vowelCount;

            inputString.toLowerCase();

            for(int i =0 ; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowelCount++;
            }

            return vowelCount;
        }
}


