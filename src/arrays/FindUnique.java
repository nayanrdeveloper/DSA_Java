package arrays;

public class FindUnique {
    public static int findUniqueNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == Integer.MIN_VALUE) continue;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[i] = Integer.MIN_VALUE;
                    numbers[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        for (int num : numbers) {
            if (num != Integer.MIN_VALUE) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 2, 3, 5, 3, 1, 5};
        int answer = findUniqueNumber(numbers);
        System.out.println("Answer is a " + answer);
    }

}
