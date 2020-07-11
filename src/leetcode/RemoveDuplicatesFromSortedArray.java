package leetcode;
/*
Given a sorted array nums, remove the duplicates in-place such
that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by
modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of
nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
 */

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int z = 0;
        int temp = nums[0] - 1;

        for (int i : nums) {
            if (i != temp) {
                nums[z] = i;
                temp = i;
                z++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return z;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 1, 2};
        int[] a2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] a3 = new int[]{1, 1, 2, 2};
        int[] a4 = new int[0];
//        System.out.println(removeDuplicates(a1));
//        System.out.println(removeDuplicates(a2));
//        System.out.println(removeDuplicates(a3));
        System.out.println(removeDuplicates(a4));

    }
}
