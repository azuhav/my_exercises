package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LastStoneWeightMore {
    public static int lastStoneWeight(int[] stones) {

        if (stones.length == 1) return stones[0];

        int counter = stones.length;

        ArrayList<Integer> list = new ArrayList<>();

        for (int z = 0; z < stones.length; z++) {
            list.add(stones[z]);
        }

        while (counter != 1) {
            sortIt(list);
            int temp = list.get(0) - list.get(1);
            list.set(1, temp);
            list.remove(0);
            System.out.println(list);
            counter--;
        }

        return list.get(0);

    }

    public static ArrayList<Integer> sortIt(ArrayList<Integer> temp) {
        for (Integer i : temp) {
            for (int j = 1; j < temp.size(); j++) {
                if (temp.get(j - 1) < temp.get(j)) {
                    int tempX = temp.get(j - 1);
                    temp.set(j - 1, temp.get(j));
                    temp.set(j, tempX);
                }
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
