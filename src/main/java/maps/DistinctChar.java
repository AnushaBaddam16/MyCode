package maps;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class DistinctChar {
    public static HashMap<Character,Integer> differentOccur(String str){
        HashMap<Character,Integer> charcount = new HashMap<>();
        String strlower = str.toLowerCase();
        char[] ch = strlower.toCharArray();
        for(Character letter:ch){
            if(charcount.containsKey(letter))
                charcount.put(letter,charcount.get(letter)+1);
            else if(letter!=' ')
                charcount.put(letter,1);
        }
        return charcount;
    }

}