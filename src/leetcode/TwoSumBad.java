package leetcode;

import java.util.Arrays;

public class TwoSumBad {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
//        int[] myResult1 = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
//        System.out.println(Arrays.toString(myResult1));
//        int[] myResult2 = ts.twoSum(new int[]{3, 2, 4}, 6);
//        System.out.println(Arrays.toString(myResult2));
//        int[] myResult3 = ts.twoSum(new int[]{3, 3}, 6);
//        System.out.println(Arrays.toString(myResult3));
        int[] myResult4 = ts.twoSum(new int[]{0, 4, 3, 0}, 6);
        System.out.println(Arrays.toString(myResult4));
    }
}
