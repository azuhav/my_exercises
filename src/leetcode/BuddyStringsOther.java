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

import java.util.HashMap;

public class BuddyStringsOther {

    public static boolean buddyStrings(String A, String B) {

        if (A.length() != B.length() || A.length() == 0) return false;

        if (A.length() == 2) {
            if (A.charAt(0) == B.charAt(1) && A.charAt(1) == B.charAt(0)) return true;
        }

        System.out.println("1");

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        collect(mapA, A);
        collect(mapB, B);

        if (!mapA.keySet().equals(mapB.keySet())) return false;

        for (Character ch : mapA.keySet()) {
            if (!mapA.get(ch).equals(mapB.get(ch))) {
                return false;
            }
        }

        System.out.println("2");

        if (mapA.keySet().size() == A.length() && A.equals(B)) return false;

        System.out.println("3");

        for (Character ch : mapA.keySet()) {
            if (mapA.get(ch) > 1) {
                return true;
            }
        }

        System.out.println("4");

        return false;


    }

    public static void collect(HashMap<Character, Integer> m, String s) {
        for (int z = 0; z < s.length(); z++) {
            if (!m.containsKey(s.charAt(z))) {
                m.put(s.charAt(z), 1);
            } else
                m.put(s.charAt(z), 1 + m.get(s.charAt(z)));
        }
    }

    public static void main(String[] args) {
//        System.out.println(buddyStrings("", "ab")); // false
//        System.out.println(buddyStrings("aa", "aa")); // true
//        System.out.println(buddyStrings("ab", "ab")); // false
        System.out.println(buddyStrings("ab", "ba")); // true
//        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb")); // true
//        System.out.println(buddyStrings("abcd", "badc")); // false
//        System.out.println(buddyStrings("abcd", "abcd")); // false
//        System.out.println(buddyStrings("abab", "abab")); // true
//        System.out.println(buddyStrings("abc", "bca")); // false
    }
}