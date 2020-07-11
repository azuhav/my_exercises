package leetcode;

import java.util.ArrayList;

public class HappyNumberSlow {
    boolean flag;

    public boolean isHappy(int n) {

        if (n == 1) return true;

        try {

            int temp = sum(separate(n));

            if (temp != 1) {
                isHappy(temp);
            } else {
                flag = true;
            }
            return flag;
        } catch (StackOverflowError e) {
            return false;
        }
    }

    public int sum(ArrayList<Integer> a) {

        for (int x = 0; x < a.size(); x++) {
            a.set(x, (int) (Math.pow(a.get(x), 2)));
        }

        int sum = 0;

        for (Integer i : a) {
            sum += i;
        }

        return sum;
    }

    public static ArrayList<Integer> separate(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        if (n > 10) {
            while (n != 0) {
                arr.add(n % 10);
                n = n / 10;
            }
        } else arr.add(n);
        return arr;

    }


    public static void main(String[] args) {
        HappyNumberSlow hp = new HappyNumberSlow();
        System.out.println(hp.isHappy(2));
    }
}
