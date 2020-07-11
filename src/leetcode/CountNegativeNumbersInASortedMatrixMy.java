package leetcode;

public class CountNegativeNumbersInASortedMatrixMy {
    public static int countNegatives(int[][] grid) {

        int x = grid.length - 1;
        int counter = 0;

        for (int[] y : grid) {
            for (int z = grid[x].length - 1; z >= 0; z--) {
                if (grid[x][z] < 0) {
                    counter++;
                } else {
                    continue;
                }
            }
            x--;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{4, 3, 2, -1},
                {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
    }
}
