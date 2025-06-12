package recursion;

// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n=5 then you have to return 1-2+3-4+5= 3 as your answer

import utils.InputUtils;

public class SumNaturalAlternate {
    public static int calculateSumNaturalAlternateNUmber(int number){
        if (number == 0){
            return 0;
        }
        return number % 2 == 0 ? calculateSumNaturalAlternateNUmber(number - 1) - number: calculateSumNaturalAlternateNUmber(number - 1) + number;
    }

    public static int calculateSumNumber(int number) {
        if (number == 1) {
            return 1;
        }
        return calculateSumNumber(number - 1) + number;
    }

    public static void main(String[] args) {
        int number = InputUtils.readTarget();
        int answer = calculateSumNaturalAlternateNUmber(number);
//        int answer = calculateSumNumber(number);
        System.out.println(answer);
    }
}
