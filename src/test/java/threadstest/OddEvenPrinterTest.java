package threadstest;

import org.junit.Test;
import threads.EvenPrinter;
import threads.OddEvenPrinter;
import threads.OddPrinter;

import static org.junit.Assert.assertEquals;
import java.util.List;

public class OddEvenPrinterTest {

    @Test
    public void testEvenPrinter() {
        EvenPrinter evenPrinter = new EvenPrinter();
        Thread evenThread = new Thread(evenPrinter);
        evenThread.start();

        try {
            evenThread.join(); // Wait for evenThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> evenNumbers = EvenPrinter.getEvenNumbers();
        assertEquals(30, evenNumbers.size());
        assertEquals(2, evenNumbers.get(0).intValue());
        assertEquals(60, evenNumbers.get(evenNumbers.size() - 1).intValue());
    }

    @Test
    public void testOddPrinter() {
         OddPrinter oddPrinter = new OddPrinter();
        Thread oddThread = new Thread(oddPrinter);
        oddThread.start();

        try {
            oddThread.join(); // Wait for oddThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> oddNumbers = OddPrinter.getOddNumbers();
        assertEquals(30, oddNumbers.size());
        assertEquals(1, oddNumbers.get(0).intValue());
        assertEquals(59, oddNumbers.get(oddNumbers.size() - 1).intValue());
    }
}
