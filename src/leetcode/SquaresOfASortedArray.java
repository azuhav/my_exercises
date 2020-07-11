package leetcode;
/*
Given an array of integers A sorted in non-decreasing order,
return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
 */

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] A) {

        int[] ans = new int[A.length];
        for (int i = A.length - 1, l = 0, r = A.length - 1; i >= 0; i--) {
            ans[i] = (A[l] * A[l]) <= (A[r] * A[r]) ? (A[r] * A[r--]) : (A[l] * A[l++]);
        }
        return ans;
    }
    /*
     public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
