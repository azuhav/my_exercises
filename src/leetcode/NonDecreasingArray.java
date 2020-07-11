package leetcode;
/*
Given an array nums with n integers, your task is to check if it could
become non-decreasing by modifying at most 1 element.
We define an array is non-decreasing if nums[i] <= nums[i + 1] holds
for every i (0-based) such that (0 <= i <= n - 2).

Example 1:

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 */

public class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {

        int counter = 0;

        for (int x = 1; x < nums.length; x++) {
            if (counter > 1) return false;
            if (nums[x - 1] > nums[x]) {
                counter++;
                if (x == 1) {
                    nums[x - 1] = nums[x];
                } else if (nums[x] < nums[x - 2]) {
                    nums[x] = nums[x - 1];
                } else {
                    nums[x - 1] = nums[x - 2];
                }
            }
        }
        return counter < 2;
    }

    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{4, 2, 3})); // true
        System.out.println(checkPossibility(new int[]{3, 4, 2, 3})); // false
        System.out.println(checkPossibility(new int[]{2, 3, 3, 2, 4})); // true
        System.out.println(checkPossibility(new int[]{-1, 4, 2, 3})); // true
    }
}