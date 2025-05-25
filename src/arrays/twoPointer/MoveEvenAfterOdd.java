package arrays.twoPointer;


// Given an array of integers 'a' move all the even integers at the beginning of the array followed by all the odd
// integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.
// a = {1,2,3,4,5,6,7}
// ans = {2,4,6,1,3,5,7}

import utils.InputUtils;
import utils.PrintUtils;

public class MoveEvenAfterOdd {
    public static void swapArray(int[] arr, int firstIndex, int lastIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public static void arrayMoveEvenAfterOdd(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first] % 2 != 0 && arr[last] % 2 == 0) {
                swapArray(arr, first, last);
                first++;
                last--;
            } else {
                if (arr[first] % 2 == 0) {
                    first++;
                }
                if (arr[last] % 2 != 0) {
                    last--;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        System.out.println("Before");
        PrintUtils.printArray(arr);
        arrayMoveEvenAfterOdd(arr);
        System.out.println("After");
        PrintUtils.printArray(arr);
    }
}
