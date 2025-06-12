package recursion;

import utils.InputUtils;

// number = 5
//  0 1 1 2 3 5 8
// 0 1 2 3 4 5 6

public class FindFibonaccies {
    public static int calculateFibonaccies(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return calculateFibonaccies(number - 1) + calculateFibonaccies(number - 2);

    }

    public static void main(String[] args) {
        int number = InputUtils.readTarget();
        System.out.println(calculateFibonaccies(number));
    }
}
