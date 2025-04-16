package org.recursion.reverseArray;

public class ReversedArray {
    public void reversedArray(int start, int[] arr, int end) {
        if (start >= end) {
            return;
        }

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recur
        reversedArray(start + 1, arr, end - 1);
    }
}
