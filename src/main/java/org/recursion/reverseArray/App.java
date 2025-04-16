package org.recursion.reverseArray;

public class App
{
    public static void main( String[] args )
    {   // reversed array code
        int arr[] = {1, 4, 5, 7, 8};
        int n = arr.length;
        int i = 0;


        System.out.println("Original array:");
        printArray(arr);

        ReversedArray reverse = new ReversedArray();
        reverse.reversedArray(i, arr, n - 1); // ✅ pass n - 1 instead of n

        System.out.println("Reversed array:");
        printArray(arr);


    }

    public static void printArray(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
