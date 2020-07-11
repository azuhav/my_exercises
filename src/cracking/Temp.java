package cracking;

import java.util.ArrayList;


public class Temp {

    public static int count(int[] li) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int x = 0; x < li.length; x++) {
            arr.add(li[x]);
        }

        int result = 0;

        for (int x = arr.size() - 1, y = 0; x >= 0; x--, y++) {
            int temp = arr.get(x);
            result += temp * (Math.pow(2, y));
            System.out.println(x + " " + y);

        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(count(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}));

    }
}
