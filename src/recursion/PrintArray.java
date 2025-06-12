package recursion;

import utils.InputUtils;

// arr = {1,3,5,7,9,0}
public class PrintArray {

    public static void printArray(int[] arr, int index) {
        int n = arr.length;
        if (index == n) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }


    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        printArray(arr, 0);
    }
}
