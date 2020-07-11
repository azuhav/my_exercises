package codeWars;

import java.util.Arrays;

public class Main {

    // this is the code to get largest value of given
    // O(n)
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) max = arr[x];
        }
        return max;
    }

    // Given a sorted array and a number x, find the pair
    // in array whose sum is closest to x

    public static void closest(int[] ar, int x) {

        int index = Arrays.binarySearch(ar, x);

        // depending of value of x I will start summation to the left from x
        // in my test case the x = 5, so in part or array: 1 is starting point and 5 is end point

        for (int y = 0, z = index - 1; y < index; y++, z--) {
            int c = ar[y] + ar[z];
            if (c == x) System.out.println("closest pair is " + ar[y] + " " + ar[z]);
        }
    }

    public static void main(String[] args) {
        String s1 = "String";
        String s2 = s1.substring(2);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s2);
        System.out.println(largest(new int[]{12, 89, 54, 3, 90, 111}));
        closest(arr, 5);
    }
}
