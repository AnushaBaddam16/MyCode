package arrays;

public class MoveZeros {

    public static void main(String[] args) {
        // Sample array
        int[] arr = {0, 1, 0, 5, 11, 0, 9, 0, 3};
        System.out.println("Given Array:");
        showArray(arr);

        moveZerosToend(arr);

        System.out.println("\nArray after moving zeros to the end:");
        showArray(arr);
    }
    private static void moveZerosToend(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    private static void showArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
