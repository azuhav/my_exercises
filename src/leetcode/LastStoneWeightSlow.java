package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class LastStoneWeightSlow {

    public static int lastStoneWeight(int[] stones) {

        ArrayList<Integer> arr = new ArrayList<>(stones.length);

        for (int x = 0; x < stones.length; x++) {
            arr.add(stones[x]);
        }

        int counter = arr.size();

        while (counter != 1) {
            Collections.sort(arr);
            Collections.reverse(arr);
            int temp = arr.get(0) - arr.get(1);
            arr.set(0, temp);
            arr.remove(1);
            System.out.println(arr);
            counter--;
            }



        return arr.get(0);

    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
