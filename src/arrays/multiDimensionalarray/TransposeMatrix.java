package arrays.multiDimensionalarray;

/*
 * 🚀 Program: Transpose of a Matrix
 *
 * ✅ Problem Statement:
 * Write a program to display the transpose of a matrix entered by the user.
 *
 * 🔄 Transpose Definition:
 * Transpose of a matrix is obtained by interchanging its rows and columns.
 *
 * 📥 Input Example:
 * Matrix (3x2):
 * [
 *   [1, 2],
 *   [3, 4],
 *   [5, 6]
 * ]
 *
 * 📤 Expected Output (Transpose 2x3):
 * [
 *   [1, 3, 5],
 *   [2, 4, 6]
 * ]
 *
 * 📌 Note:
 * For a matrix of size m x n, its transpose will be of size n x m.
 */

import utils.InputUtils;
import utils.PrintUtils;

public class TransposeMatrix {
    public static int[][] transposeMatrix(int[][] multiDimensionArr){
        int rows = multiDimensionArr.length;
        int cols = multiDimensionArr[0].length;

        int[][] transposeMatrixArr = new int[cols][rows];

        for (int i=0; i< cols; i++){
            for (int j=0; j< rows; j++){
                transposeMatrixArr[i][j] = multiDimensionArr[j][i];
            }
        }
        return transposeMatrixArr;
    }

    public static void main(String[] args) {
        int[][] arr = InputUtils.readMultiDimensionalArray();
        int [][] tranposeArr= transposeMatrix(arr);

        PrintUtils.printMultiDimensionalArray(tranposeArr);
    }

}
