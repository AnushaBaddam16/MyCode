package streamsandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOrderSort {
    public List<String> sortBasedOnLength(String[] arr) {
        return Arrays.stream(arr)
                .sorted((stringOne, stringTwo) -> {
                    if(stringOne.length() == stringTwo.length())
                        return stringTwo.charAt(stringTwo.length() - 1)
                                - stringOne.charAt(stringOne.length() - 1);
                    else
                        return stringOne.length() - stringTwo.length();
                })
                .collect(Collectors.toList());
    }
}