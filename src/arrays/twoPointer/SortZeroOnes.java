package arrays.twoPointer;

import utils.InputUtils;
import utils.PrintUtils;

// Sort an Array consisting of only 0s and 1s
public class SortZeroOnes {
    public static void sortZeroOnes(int[] arr) {
        // arr = {1,0,1,0,1}
        int size = arr.length;
        int zeroCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        for (int i = 0; i < size; i++) {
            if (zeroCount > i) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortZeroOneTwoPointerApproach(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        System.out.println("Before Sorted");
        PrintUtils.printArray(arr);
//        sortZeroOnes(arr);
        sortZeroOneTwoPointerApproach(arr);
        System.out.println("After Sorted");
        PrintUtils.printArray(arr);
    }
}
