package leetcode;
/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j
in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int temp = j - i;
                    System.out.println("nums[i] = " + nums[i] + ", i = " + i + ", " + "j = " + j + ", " + "res = " + (j - i));
                    if (!map.containsKey(nums[i])) {
                        map.put(nums[i], temp);
                        System.out.println(map.get(nums[i]));
                    } else {
                        if (map.get(nums[i]) > temp) {
                            map.replace(nums[i], temp);
                            System.out.println(map.get(nums[i]));
                        }
                    }
                }
            }
        }


        if (map.size() > 0) {
            int min = Collections.min(map.values());
            System.out.println("Map size = " + map.size());
            System.out.println(min);
            return min <= k;
        } else return false;

    }


    public static void main(String[] args) {
        ContainsDuplicate2 cd2 = new ContainsDuplicate2();
        System.out.println(cd2.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // must be false
        System.out.println(cd2.containsNearbyDuplicate(new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}, 1));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{1, 2}, 2));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{}, 0));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{99, 99}, 2));
        System.out.println(cd2.containsNearbyDuplicate(new int[]{1, 2}, 2));
    }
}