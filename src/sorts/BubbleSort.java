package sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {


        int[] list = {112, 45, 23, 5, 90, 1, 43, 77, 0, 25, 2};

        for (int i : list) {
            for (int j = 1; j < list.length; j++) {
                if (list[j - 1] > list[j]) {
                    //swap elements
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));

        String s = "String";
        StringBuilder sb = new StringBuilder(s);
        String sEdit = sb.substring(1,6);
        sb.delete(2,10);
        System.out.println(sb);

    }
}
