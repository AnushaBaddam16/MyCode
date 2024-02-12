package threads;
import java.util.ArrayList;
import java.util.List;
public class OddPrinter implements Runnable{
    public static final List<Integer> oddNumbers = new ArrayList<>();
    @Override
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            oddNumbers.add(i);
        }
    }
    public static List<Integer> getOddNumbers() {
        return oddNumbers;
    }
}