package recursion;
// Find the sum of the elements of the array [2,3,5,20,1]

import utils.InputUtils;

public class SumOfArray {
    public static int calculateSumOfArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + calculateSumOfArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        int sum = calculateSumOfArray(arr, 0);
        System.out.println(sum);
    }
}
