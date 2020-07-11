package sedgewick;

import java.util.Arrays;

public class GetMax {

    public static void bSort(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) max = arr[x];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        bSort(new int[]{3, 10, 1, 45, 4});
    }
}
