package arraylist;
import java.util.ArrayList;

public class LastObject {
    public ArrayList<String> removeLastObject(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty())
            arrayList.remove(arrayList.size() - 1);
        return arrayList;
    }
}
