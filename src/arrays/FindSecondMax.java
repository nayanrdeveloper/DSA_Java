package arrays;

public class FindSecondMax {
    public static int findMaxNumber(int[] numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public static int secondLargetNumber(int[] numbers) {
        int maxNumber = findMaxNumber(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == maxNumber) {
                numbers[i] = Integer.MIN_VALUE;
            }
        }
        int secondLargestNumber = Integer.MIN_VALUE;

//        for (int number : numbers) {
//            if (number > secondLargestNumber) {
//                secondLargestNumber = number;
//            }
//        }
//        return  secondLargestNumber;

        secondLargestNumber = findMaxNumber(numbers);
        return secondLargestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 7, 4, 8, 1};
        int maxNumber = secondLargetNumber(numbers);
        System.out.println("Max Number is a " + maxNumber);
    }
}
