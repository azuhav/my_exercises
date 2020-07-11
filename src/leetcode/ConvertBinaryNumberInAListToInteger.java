package leetcode;
/*
Given head which is a reference node to a singly-linked list.
The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

<<Bitwise solution>>
class Solution {
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        while (head != null) {
            decimal <<= 1;
            decimal |= head.val;
            head = head.next;
        }
        return decimal;
    }
}

 */

class ListNodeOne {

    int val;
    ListNodeOne next;

    ListNodeOne() {
    }

    ListNodeOne(int val) {
        this.val = val;
    }

    ListNodeOne(int val, ListNodeOne next) {
        this.val = val;
        this.next = next;
    }
}

public class ConvertBinaryNumberInAListToInteger {

    public static int getDecimalValue(ListNodeOne head) {

        String s = "";

        ListNodeOne current = head;

        s = s + Integer.valueOf(current.val);

        while (current.next != null) {
            current = current.next;
            s = s + Integer.valueOf(current.val);
        }
        return Integer.parseInt(s, 2);
    }

    public static void main(String[] args) {

        ListNodeOne ln = new ListNodeOne();
        new ListNodeOne(1, new ListNodeOne());
        new ListNodeOne(0, new ListNodeOne());
        new ListNodeOne(1, new ListNodeOne());

        System.out.println(getDecimalValue(ln));

    }
}

