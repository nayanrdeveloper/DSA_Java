package arrays.prefix;

import utils.InputUtils;
import utils.PrintUtils;


// Give an integer array 'a', return the prefix sum/running sum in the same array without creating new array
// a = {2,1,3,4,5}  ans={2,3,6,10,15}

public class PrefixSum {
    public static int[] calculatePreFixSum(int[] arr){
        int n = arr.length;
        int[] prefixArray = new int[n];
        prefixArray[0] = arr[0];
        for (int i=1; i< n; i++){
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }
        return prefixArray;
    }

    public static void prefixSumWithoutNewArray(int[] arr){
        int n = arr.length;
        for (int i=1; i< n; i++){
            arr[i] = arr[i -1] + arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        System.out.println("Before ");
        PrintUtils.printArray(arr);
//        int[] answer = calculatePreFixSum(arr);
        prefixSumWithoutNewArray(arr);
        System.out.println("after ");
        PrintUtils.printArray(arr);
//        PrintUtils.printArray(answer);
    }
}
