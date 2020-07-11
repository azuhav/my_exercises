package leetcode;

import java.util.ArrayList;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ConvertBinaryNumberInAListToIntegerFast {
    public static int getDecimalValue(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode current = head;

        arr.add(current.val);

        while (current.next != null) {
            current = current.next;
            arr.add(current.val);
        }

        int result = 0;

        for (int x = arr.size() - 1, y = 0; x >= 0; x--, y++) {
            int temp = arr.get(x);
            result += temp * (Math.pow(2, y));
        }

        return result;
    }

    public static void main(String[] args) {

        ListNode ln = new ListNode();
        new ListNode(1, new ListNode());
        new ListNode(0, new ListNode());
        new ListNode(1, new ListNode());

        System.out.println(getDecimalValue(ln));

    }
}
