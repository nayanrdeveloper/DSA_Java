package recursion;

import utils.InputUtils;

// arr = [5,1,7,4,9,4];
public class MaxNumberArray {
    public static int maxNumberOfArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int smallAns = maxNumberOfArray(arr, index + 1);
        if (smallAns > arr[index]) {
            return smallAns;
        } else {
            return arr[index];
        }


    }

    public static void main(String[] args) {
        int[] arr = InputUtils.readIntArray();
        int maxNumber = maxNumberOfArray(arr, 0);
        System.out.println(maxNumber);
    }
}
