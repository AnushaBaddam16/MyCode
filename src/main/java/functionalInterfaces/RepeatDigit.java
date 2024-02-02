package functionalInterfaces;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatDigit {
    public List<Integer> repeatDigits(int num) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> repeatedDigits = new ArrayList<>();
        String strnum = Integer.toString(num);
        // Count the frequency of each word
        for (char digitChar : strnum.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            countMap.put(digit, countMap.getOrDefault(digit, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue()>1)
                repeatedDigits.add(entry.getKey());
        }
        return repeatedDigits;
    }
}