package recursion;

// Given two number p & q, find the value p^q using a recursive function
//  p =3  q= 5  =   p*p*p*p*p*p

import utils.InputUtils;

public class PowerOfNumber {
    public static int calculatePowerNumberQ(int powerNumber, int qNumber) {
        if (qNumber == 0) {
            return 1;
        }
        return calculatePowerNumberQ(powerNumber, qNumber - 1) * powerNumber;
    }

    public static int calculatePowerNumberQOptimize(int powerNumber, int qNumber) {
        if (qNumber == 0) {
            return 1;
        }
//        int smallAnswer = calculatePowerNumberQOptimize(powerNumber, qNumber / 2) * calculatePowerNumberQOptimize(powerNumber, qNumber / 2);
//        if (qNumber % 2 == 0) {
//            return smallAnswer;
//        } else {
//            return smallAnswer * powerNumber;
//        }

        int smallAnswer = calculatePowerNumberQOptimize(powerNumber, qNumber / 2);
        if (qNumber % 2 == 0) {
            return smallAnswer * smallAnswer;
        } else {
            return powerNumber * smallAnswer * smallAnswer;
        }
    }


    public static void main(String[] args) {
        int powerNumber = InputUtils.readTarget();
        int qNumber = InputUtils.readTarget();
//        int answer = calculatePowerNumberQ(powerNumber, qNumber);
        int answer = calculatePowerNumberQOptimize(powerNumber, qNumber);
        System.out.println(answer);
    }

}
