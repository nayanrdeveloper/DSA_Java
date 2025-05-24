package arrays;

import utils.InputUtils;
import utils.PrintUtils;

public class RotateArrayK {
    public static int[] rotateGiveArrayKthIndex(int[] arr, int k) {
        // arr = [1,2,3,4,5];
        int arrSize = arr.length;
        k = k % arrSize;
        int[] rotatedArray = new int[arrSize];
        int j = 0;
        for (int i = arrSize - k; i < arrSize; i++) {
            rotatedArray[j++] = arr[i];
        }

        for (int i = 0; i < arrSize - k; i++) {
            rotatedArray[j++] = arr[i];
        }

        return rotatedArray;

    }

    public static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr, int first,int last){
        // a = 1,2,3,4,5
        while (first < last){
            swapArray(arr,first, last);
            first++;
            last--;
        }

    }

    public static void rotateArrayInPlace(int[] arr, int k){
        int n = arr.length;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        int k = InputUtils.readTarget();

//        int[] rotatedArray = rotateGiveArrayKthIndex(arr, k);
        rotateArrayInPlace(arr,k);
        System.out.println("Rotated Array is a ");
        PrintUtils.printArray(arr);
//        PrintUtils.printArray(rotatedArray);
    }
}
