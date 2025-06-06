package arrays.multiDimensionalarray;

import utils.InputUtils;
import utils.PrintUtils;

// a =  [
//        [2,3],
//        [3,4]
//      ]

// b =  [
//        [5,10],
//        [12,1]
//      ]
public class AdditionTwoMatrics {
    public static int[][] additionTwoMatrics(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;

        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter First Matrix");
        int[][] arr1 = InputUtils.readMultiDimensionalArray();

        System.out.println("Please Enter Second Matrix");
        int[][] arr2 = InputUtils.readMultiDimensionalArray();

        int[][] ans = additionTwoMatrics(arr1, arr2);

        PrintUtils.printMultiDimensionalArray(ans);

    }
}
