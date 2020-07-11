package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class IntersectionOfTwoArrays2 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        unpack(a1, nums1);
        unpack(a2, nums2);

        ArrayList<Integer> a3 = new ArrayList<>();

        for (int x = 0; x < a1.size(); x++) {
            int temp = a1.indexOf(a2.get(x));
            if (temp != -1) {
                a3.add(a1.get(x));
                a1.remove(x);
                a2.remove(x);
            }
        }


        return new int[]{0, 0};
    }

    public static void unpack(ArrayList<Integer> arr, int[] num) {
        for (int i : num) {
            arr.add(i);
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2};
        int[] c = {1, 2};
        int[] d = {1, 1};
        System.out.println(Arrays.toString(intersect(a, b)));
        System.out.println(Arrays.toString(intersect(c, d)));
    }
}
