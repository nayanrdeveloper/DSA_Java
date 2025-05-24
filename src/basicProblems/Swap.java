package basicProblems;

import utils.InputUtils;

public class Swap {

    public static void swapWithoutTemp(int num1, int num2) {
        System.out.println("Before Swap num1= " + num1 + " num2= " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap num1 =" + num1 + " num2= " + num2);
    }

    public static void swapWithTemp(int num1, int num2) {
        System.out.println("Before Swap num1= " + num1 + " num2= " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap num1 =" + num1 + " num2= " + num2);
    }


    public static void main(String[] args) {
        int num1 = InputUtils.readTarget();
        int num2 = InputUtils.readTarget();
//        swapWithTemp(num1,num2);
        swapWithoutTemp(num1, num2);
    }
}
