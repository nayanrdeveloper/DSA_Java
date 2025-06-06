package utils;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] readIntArray() {
        System.out.print("Enter Array Size ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Please Entre " + size + " Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[][] readMultiDimensionalArray(){
        System.out.print("Please Enter a Rows Number: ");
        int rows = scanner.nextInt();

        System.out.print("Please Enter a Cols Number: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Please Enter of Matrix "+ rows+" "+ "* "+" "+ cols);
        for (int i=0; i< rows; i++){
            for (int j=0; j< cols; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int readTarget() {
        System.out.print("Please Enter Target Number ");
        return scanner.nextInt();
    }

}
