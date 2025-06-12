package recursion;

// Given an integer, find out the sum of its digit using recursion

import utils.InputUtils;

// number = 1234 = 1+2+3+4 = 10
public class SumOfNumber {
    public static int calculateSumOfNumber(int number) {
        if (number >= 0 && number <= 1) {
            return number;
        }

        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        int ans = calculateSumOfNumber(remainingNumber) + lastDigit;
        return ans;
    }

    public static void main(String[] args) {
        int number = InputUtils.readTarget();
        int answer = calculateSumOfNumber(number);
        System.out.println(answer);
    }
}
