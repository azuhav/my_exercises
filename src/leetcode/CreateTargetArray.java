package leetcode;
/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        ArrayList<Integer> arr = new ArrayList<>();

        for (int x = 0; x < nums.length; x++) {
            arr.add(index[x], nums[x]);
        }
        Iterator<Integer> iterator = arr.iterator();
        for (int i = 0; i < target.length; i++) {
            target[i] = iterator.next().intValue();
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(createTargetArray(nums, index));

    }
}
