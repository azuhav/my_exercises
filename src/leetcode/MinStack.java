package leetcode;
/*
Design a stack that supports push, pop, top, and retrieving
the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */

import java.util.ArrayList;

public class MinStack {

    ArrayList<Integer> st = new ArrayList<>();

    public MinStack() {
    }

    public void push(int x) {
        st.add(x);
        //System.out.println(st.size());
    }

    public void pop() {
        st.remove(st.size() - 1);
    }

    public int top() {
        return st.get(st.size() - 1);
    }

    public int getMin() {
        int min = st.get(0);
        if (st.size() == 1) min = st.get(0);
        else {
            for (int x = 1; x < st.size(); x++) {
                if (st.get(x) < min) min = st.get(x);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-1);
        int param_4 = obj.getMin();
        System.out.println(param_4);
        System.out.println(obj.st);
        obj.pop();
        System.out.println(obj.top());
    }
}
