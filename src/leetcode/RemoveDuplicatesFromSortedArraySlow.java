package leetcode;
/*
Given a sorted array nums, remove the duplicates in-place such that each
element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying
the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums
being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.
Example 2:
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArraySlow {

    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i : nums) {
            if (!al.contains(i)) al.add(i);
        }

        for (int x = 0; x < nums.length && x < al.size(); x++) {
            nums[x] = al.get(x);
        }

        System.out.println(Arrays.toString(nums));

        return al.size();
    }

    public static void main(String[] args) {
        int[] i = new int[]{1, 1, 2};
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //System.out.println(removeDuplicates(i));
        System.out.println(removeDuplicates(arr));

    }
}
