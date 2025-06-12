package recursion;

import utils.InputUtils;

// x= 12 y= 28
public class GreatestCommonDivisor {
    public static int calculateGreatestCommonDivisor(int x, int y) {
        int minNumber = x > y ? y : x;
        for (int i = minNumber; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = InputUtils.readTarget();
        int y = InputUtils.readTarget();
        int answer = calculateGreatestCommonDivisor(x, y);
        System.out.println(answer);

    }
}
