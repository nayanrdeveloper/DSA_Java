package recursion;

import utils.InputUtils;

public class BasicProblem {
    public static void printOneToNNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printOneToNNumber(n - 1);
        System.out.println(n);
    }

    public static void printNToOneNumber(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        printNToOneNumber(n - 1);
    }


    public static void main(String[] args) {
        int n = InputUtils.readTarget();
//        printOneToNNumber(n);
        printNToOneNumber(n);
    }
}
