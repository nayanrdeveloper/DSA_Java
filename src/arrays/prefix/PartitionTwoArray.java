package arrays.prefix;

//Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a
// part of the array is equal to the suffix sum of rest of the array.

import utils.InputUtils;

public class PartitionTwoArray {

    public static int totalSumOfArray(int[] arr){
        int totalSum = 0;

        for (int i=0; i< arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static boolean isMakePartitionTwoArray(int[] arr){
        int total = totalSumOfArray(arr);
        int preFixSum = 0;

        for (int i=0; i< arr.length; i++){
            preFixSum += arr[i];
            int suffixSum = total - preFixSum;
            if (suffixSum == preFixSum){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        boolean isMakePartition = isMakePartitionTwoArray(arr);

        System.out.println("Your answer is a "+ isMakePartition);
    }
}
