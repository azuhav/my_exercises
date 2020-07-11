package leetcode;
/*
Given an integer n, return any array containing n unique integers
such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
 */

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {

    public static int[] sumZero(int n) {

        int[] a = new int[n];

        int sum = 0;

        for (int x = 0; x < n - 1; x++) {
            int temp = sum + x;
            a[x] = temp;
        }

        for (int i : a) {
            sum += i;
        }

        a[n - 1] = -sum;

        System.out.println(sum);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(3)));
    }
}
