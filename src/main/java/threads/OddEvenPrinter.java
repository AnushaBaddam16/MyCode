package threads;

public class OddEvenPrinter {

    public void printOddEvenNumbers() {
        // Creating two threads
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }
}