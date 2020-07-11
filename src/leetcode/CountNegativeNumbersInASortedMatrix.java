package leetcode;
/*
Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
Return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
 */

public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {

        int sum = 0;
        for (int[] each : grid) {
            int left = 0;
            int right = each.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (each[mid] < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            sum += each.length - left;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4, 3, 2, -1},
                {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
    }
}
