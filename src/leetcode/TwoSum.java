package leetcode;
/*
Given an array of integers, return indices of the two numbers such
that they add up to a specific target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
//        int[] myResult1 = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
//        System.out.println(Arrays.toString(myResult1));
//        int[] myResult2 = ts.twoSum(new int[]{3, 2, 4}, 6);
//        System.out.println(Arrays.toString(myResult2));
        int[] myResult3 = ts.twoSum(new int[]{3, 3}, 6);
        System.out.println(Arrays.toString(myResult3));
//        int[] myResult4 = ts.twoSum(new int[]{0, 4, 3, 0}, 6);
//        System.out.println(Arrays.toString(myResult4));
    }
}