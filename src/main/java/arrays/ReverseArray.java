package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        // Prompt the user to enter elements of the array
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nGiven Array:");
        showArray(arr);
        reversingArray(arr);
        System.out.println("\nReversed Array:");
        showArray(arr);

    }

    private static void reversingArray(int[] arr) {
        int i = 0;
        int a = arr.length - 1;

        while (i < a) {
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;

            i++;
            a--;
        }
    }

    private static void showArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}