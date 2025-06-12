package recursion;

import utils.InputUtils;

public class FindFactorial {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = InputUtils.readTarget();
        System.out.println(calculateFactorial(n));
    }
}
