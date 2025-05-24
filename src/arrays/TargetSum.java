package arrays;

public class TargetSum {
    public static int twoSumTarget(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 3, 5, 8, 2};
        int target = 7;

        int result = twoSumTarget(nums, target);
        System.out.println("result is " + result);
    }
}
