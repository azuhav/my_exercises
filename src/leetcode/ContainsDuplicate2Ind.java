package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2Ind {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                return true;
            }
            System.out.println("Added key: " + nums[i] + ",value: " + i);
            map.put(nums[i], i);
        }
        return false;

    }

    public static void main(String[] args) {
        ContainsDuplicate2Ind cd22 = new ContainsDuplicate2Ind();

        System.out.println(cd22.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // must be false
        System.out.println(cd22.containsNearbyDuplicate(new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}, 1));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{1, 2}, 2));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{}, 0));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{99, 99}, 2));
        System.out.println(cd22.containsNearbyDuplicate(new int[]{1, 2}, 2));
    }
}
