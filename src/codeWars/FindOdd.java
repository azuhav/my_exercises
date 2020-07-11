package codeWars;
/*
Given an array, find the integer that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
*/

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int odd = 0;
        for (int i : a) {
            int counter = 0;
            for (int value : a) {
                if (i == value) {
                    counter++;
                }
                map.put(i, counter);
            }
        }
        for (int v : map.keySet()) {
            if (map.get(v) % 2 != 0)
                odd = v;
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
    }
}
