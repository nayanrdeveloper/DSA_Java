package arrays;

import utils.InputUtils;

public class FirstRepeatNumber {
    public static int getFirstRepeatNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = InputUtils.readIntArray();
        int repeatedNumber = getFirstRepeatNumber(numbers);

        System.out.println("Repeat Number is " + repeatedNumber);
    }
}
