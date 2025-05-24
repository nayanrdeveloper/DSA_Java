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

    public static int readTarget() {
        System.out.print("Please Enter Target Number ");
        return scanner.nextInt();
    }

}
