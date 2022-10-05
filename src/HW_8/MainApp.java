package HW_8;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));

        nums = new int[]{1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(nums)));

        nums = new int[]{3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
