package recursion;

import utils.InputUtils;

public class CountNumber {
    public static int calculateCountNumber(int number, int count) {
        if (number >= 1 && number <= 9) {
            return count + 1;
        }

        return calculateCountNumber(number / 10, count + 1);
    }

    public static int calculateCountNumber(int number) {
        return calculateCountNumber(number, 0);
    }


    public static void main(String[] args) {
        int number = InputUtils.readTarget();
        int answer = calculateCountNumber(number);
        System.out.println(answer);
    }
}
