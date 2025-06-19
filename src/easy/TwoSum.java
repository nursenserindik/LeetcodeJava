package easy;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] numbers ={2,7,6,10};
        int target=9;

        int[] result = twoSum(numbers, target);

        System.out.println("Sonuç: " + Arrays.toString(result));
    }
}



