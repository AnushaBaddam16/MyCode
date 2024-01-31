package functionalInterfaces;

public class ArraySum {

    public static int calculateArraySum(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty. Sum is 0.");
            return 0;
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}
