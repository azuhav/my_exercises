package sedgewick;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] array) {

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < array[mid]) hi = mid - 1;
            else if (key > array[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(rank(4, new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}));
    }
}
