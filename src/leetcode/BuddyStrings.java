package leetcode;
/*
Given two strings A and B of lowercase letters, return true if and
only if we can swap two letters in A so that the result equals B.

Example 1:

Input: A = "ab", B = "ba"
Output: true
Example 2:

Input: A = "ab", B = "ab"
Output: false
 */

public class BuddyStrings {

    public static boolean buddyStrings(String A, String B) {

        if (A.length() != B.length() || A.length() == 0) return false;

        if (A.equals(B)) {
            char temp = '\n';
            int counter = 0;
            for (int z = 0; z < A.length(); z++) {
                if (temp != A.charAt(z)) {
                temp = A.charAt(z);
                System.out.println(temp);}
                else continue;
                if (counter % 2 != 0) break;
                for (char ch : A.toCharArray()) {
                    if (ch == temp) counter++;
                }
            }
            return counter % 2 == 0;
        } else {
            for (int x = 0; x < A.length(); x++) {
                for (int y = A.length() - 1; y > 0; y--) {
                    char[] a = A.toCharArray();
                    if (A.charAt(x) != A.charAt(y)) {
                        a[y] = A.charAt(x);
                        a[x] = A.charAt(y);
                    }
                    String newA = new String(a);
                    if (newA.equals(B)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("", "ab")); // false
        System.out.println(buddyStrings("aa", "aa")); // true
        System.out.println(buddyStrings("ab", "ab")); // false
        System.out.println(buddyStrings("ab", "ba")); // true
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb")); // true
        System.out.println(buddyStrings("abcd", "badc")); // false
        System.out.println(buddyStrings("abcd", "abcd")); // false
        System.out.println(buddyStrings("abab", "abab")); // true
    }
}