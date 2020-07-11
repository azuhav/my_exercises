package sorts;

import java.util.Arrays;

public class BubbleSortTwo {


    int[] list = {112, 45, 23, 5, 90, 1, 43, 77, 0, 25, 2};

    public void sortIt() {

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        boolean boo = true;
        System.out.println(boo);
    }
}
