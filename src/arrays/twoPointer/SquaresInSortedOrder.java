package arrays.twoPointer;

// Given an integer array a sorted in non-decreasing order, return an array of the squares of each number sorted in
// non-decreasing order.
//  a = {-10, -3, -2, 1,4,5}   ans = {100, 25, 16, 9, 4, 1}

import utils.InputUtils;
import utils.PrintUtils;

public class SquaresInSortedOrder {
    public static int[] squaresInSortOrder(int[] arr){
        int left = 0; int right = arr.length -1;
        int n = arr.length;
        int[] result = new int[n];
        int k = 0;

        while (left <= right){
            if (Math.abs(arr[left])  > Math.abs(arr[right])){
                result[k++] = arr[left] * arr[left];
                left++;
            }else {
                result[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        System.out.println("Before");
        PrintUtils.printArray(arr);

        int [] ans = squaresInSortOrder(arr);
        System.out.println("After");
        PrintUtils.printArray(ans);
    }
}
