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

// WORKING SOLUTION

import java.util.*;

public class BuddyStringsMore {

    public static boolean buddyStrings(String A, String B) {

        if (A.length() != B.length() || A.length() == 0) return false;

        if (A.equals(B)) {

            HashSet<Character> chars = new HashSet<>();
            for (char ch : A.toCharArray()) {
                chars.add(ch);
            }

            return chars.size() < A.length();

        }

        List<Integer> diff = new ArrayList<>();

        for (int x = 0; x < A.length(); x++) {
            int counter = 0;
            if (A.charAt(x) != B.charAt(x)) {
                diff.add(x);
            }else  {
                counter++;
                if (counter > 2) return true;
            }
        }


          //  System.out.println(A.charAt(diff.get(0)));


        return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
                && B.charAt(diff.get(0)) == A.charAt(diff.get(1));
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