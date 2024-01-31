package functionalInterfaces;

public class SwapValues {

    public static void swap(int[] values) {
        if (values == null || values.length != 2) {
            throw new IllegalArgumentException("Array must contain exactly two elements");
        }

        System.out.println("Before swapping: a = " + values[0] + ", b = " + values[1]);

        values[0] = values[0] + values[1];
        values[1] = values[0] - values[1];
        values[0] = values[0] - values[1];

        System.out.println("After swapping: a = " + values[0] + ", b = " + values[1]);
    }
}

