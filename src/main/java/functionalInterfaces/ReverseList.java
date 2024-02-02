package functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public ArrayList<String> reverseList(ArrayList<String> arrlist){
        if (arrlist != null && !arrlist.contains(null)) {
            Collections.reverse(arrlist);}
        return arrlist;
    }

}
