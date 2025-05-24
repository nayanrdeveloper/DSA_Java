package arrays;

import utils.InputUtils;
import utils.PrintUtils;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        //  a = {2,3,4,5}
        int[] reverseNewArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseNewArray[j++] = arr[i];
        }
        return reverseNewArray;
    }

    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArrayTwoPointer(int[] arr) {
        // a = {2,3,4,5}
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
//        int[] reverseArrays = reverseArray(arr);
//        PrintUtils.printArray(reverseArrays);

        reverseArrayTwoPointer(arr);
        PrintUtils.printArray(arr);
    }
}
