package leetcode;

/*
Write a function that reverses a string. The input string is given as an
array of characters char[].
Do not allocate extra space for another array, you must do this by modifying
the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */

public class ReverseString {
    public static char[] reverseString(char[] s) {

        for (int x = 0, y = 0; x < s.length / 2; x++, y++) {
            char temp = s[x];
            s[x] = s[s.length - 1 - y];
            s[s.length - 1 - y] = temp;
        }

        return s;

    }

    public static void main(String[] args) {
        System.out.println(reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
    }
}
