package arrays.multiDimensionalarray;

import java.util.Scanner;

public class BasicLearning {

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a Rows Number: ");
        int rows = sc.nextInt();

        System.out.print("Please Enter a Cols Number: ");
        int cols = sc.nextInt();
        int[][] multiArr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiArr[i][j] = sc.nextInt();
            }
        }

        printArray(multiArr);

    }
}
