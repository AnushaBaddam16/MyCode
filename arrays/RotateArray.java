package arrays;

import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }


        System.out.print("Enter the number of positions to rotate the array left: ");
        int rotations = scanner.nextInt();


        rotateLeft(originalArray, rotations);


        System.out.println("\nRotated Array:");
        showArray(originalArray);

        scanner.close();
    }

    private static void rotateLeft(int[] arr, int x) {
        int length = arr.length;

        x = x % length;

        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i - x + length) % length] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, length);
    }

    // Method to display the elements of an array
    private static void showArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
