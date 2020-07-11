package leetcode;
/*
Given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
 */

public class Maximum69Number {

    public static int maximum69Number(int num) {

        int newNum = 0;

        while (num != 0) {
            newNum = newNum * 10 + num % 10;
            num /= 10;
        }

        int temp = 0;
        boolean flag = true;

        while (newNum != 0) {
            int nine = newNum % 10;
            if (flag) {
                if (nine != 9) {
                    nine = 9;
                    flag = false;
                }
            }
            temp = temp * 10 + nine;
            newNum /= 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9696));

    }

}
