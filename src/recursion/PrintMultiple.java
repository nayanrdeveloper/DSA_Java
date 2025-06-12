package recursion;

import utils.InputUtils;

// number = 5
// k = 6
// output = 5 10 15 20 25 30
public class PrintMultiple {
    public static void printMultipleOfK(int number, int k){
        if (k == 1){
            System.out.println(number);
            return;
        }
        printMultipleOfK(number, k-1);
        System.out.println(number * k+ ", ");
    }

    public static void main(String[] args) {
        int number = InputUtils.readTarget();
        int k = InputUtils.readTarget();
        printMultipleOfK(number,k);
    }
}
