package arrays.multiDimensionalarray;
// a= [
//    [1,2,3],
//      [4,5,6],
//      [7,8,9]
// ]
//  ans = [
//    [3,2,1],
//      [6,5,4],
//      [9,9,7]
//  ]

import utils.InputUtils;
import utils.PrintUtils;

public class ReverseRowDimension {
    public static int[][] reverseRowDimension(int[][] multiDimensionArr) {
        int rows = multiDimensionArr.length;
        int cols = multiDimensionArr[0].length;

        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = multiDimensionArr[i][cols - 1 - j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = InputUtils.readMultiDimensionalArray();
        int[][] ans = reverseRowDimension(arr);
        PrintUtils.printMultiDimensionalArray(ans);
    }

}
