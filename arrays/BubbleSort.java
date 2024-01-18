package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++ )
            {
                if (arr[i] > arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] myArray = {12,5,1,13,21,4,16};
        bubbleSort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}
