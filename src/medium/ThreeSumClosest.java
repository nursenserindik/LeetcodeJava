package medium;
import java.util.*;
public class ThreeSumClosest {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length;
            int res = nums[0] + nums[1] + nums[2];

            for (int i = 0; i < n - 2; i++) {
                int left = i + 1, right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (Math.abs(target - sum) < Math.abs(target - res)) {
                        res = sum;
                    }

                    if (sum == target) {
                        return target;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            return res;
        }

        public static void main(String[] args) {
            ThreeSumClosest solver = new ThreeSumClosest();

            int[] nums1 = {-1, 2, 1, -4};
            int target1 = 1;
            int result1 = solver.threeSumClosest(nums1, target1);
            System.out.println("Example 1 → Input: " + Arrays.toString(nums1) + ", Target: " + target1);
            System.out.println("Output: " + result1);
        }
}


