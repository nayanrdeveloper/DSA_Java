package recursion;

import utils.InputUtils;

// Given an array of n integers and a target value x. Print whether x exists in the array or not
// input: n=8, x=14, array= [4,12,54,14,3,8,6]
public class TargetValueOrNot {
    public static boolean checkTargetValueOnArray(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return checkTargetValueOnArray(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        int targetNumber = InputUtils.readTarget();
        boolean isNumberInArray = checkTargetValueOnArray(arr, targetNumber, 0);
        System.out.println(isNumberInArray);
    }
}
