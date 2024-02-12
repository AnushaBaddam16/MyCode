package threads;

import java.util.ArrayList;
import java.util.List;
public class EvenPrinter implements Runnable {
    public static final List<Integer> evenNumbers = new ArrayList<>();
    @Override
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            evenNumbers.add(i);
        }
    }
    public static List<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}