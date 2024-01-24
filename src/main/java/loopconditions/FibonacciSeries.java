package loopconditions;

public class FibonacciSeries {
    static void printFibonacciSeries(int n) {
        int firstNumber = 0, secondNumber = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(firstNumber + " ");

            int lastNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = lastNumber;
        }
    }


    public static void main(String[] args) {
        printFibonacciSeries(15);
    }
}
