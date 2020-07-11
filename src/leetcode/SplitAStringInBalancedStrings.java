package leetcode;
/*
Balanced strings are those who have equal quantity of 'L' and 'R' characters.
Given a balanced string s split it in the maximum amount of balanced strings.
Return the maximum amount of splitted balanced strings.

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
public class SplitAStringInBalancedStrings {
    public static int balancedStringSplit(String s) {

        int substringCounter = 0;
        int fCounter = 0;
        int sCounter = 0;

        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == 'L') {
                fCounter++;
            } else {
                sCounter++;
            }

            if (fCounter == sCounter) {
                substringCounter++;
                sCounter = 0;
                fCounter = 0;
            }
        }
        return substringCounter;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }
}
