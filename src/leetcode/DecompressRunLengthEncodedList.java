package leetcode;

import java.util.Arrays;

/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i],
nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements
with value val concatenated in a sublist.
Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

Example 1:
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/
public class DecompressRunLengthEncodedList {

    public static int[] decompressRLElist(int[] nums) {

        int len = 0;
        int position = 0;

        for (int x = 0; x < nums.length; x += 2) {
            int temp = nums[x];
            len += temp;
        }

        int[] fin = new int[len];

        for (int x = 0; x < nums.length; x += 2) {
            int temp = nums[x];
            int[] arr = new int[temp];
            for (int y = 0; y < arr.length; y++) {
                arr[y] = nums[x + 1];
            }
            System.arraycopy(arr, 0, fin, position, arr.length);
            position += arr.length;
        }

        System.out.println(fin.length);
        return fin;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
        System.out.print(Arrays.toString(decompressRLElist(new int[]{55,11,70,26,62,64})));
    }
}
