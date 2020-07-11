package leetcode;
/*
iven an array of integers arr, write a function that returns
true if and only if the number of occurrences of each value in the array is unique.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
No two values have the same number of occurrences.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
            map.replace(i, map.get(i) + 1);
        }

        for (int x : map.values()) {
            if (!set.contains(x))
                set.add(x);
            else return false;
        }

        return true;
    }
}
