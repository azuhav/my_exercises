package leetcode;

/*
Given n and m which are the dimensions of a matrix initialized by zeros
and given an array indices where indices[i] = [ri, ci].
For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after
applying the increment to all indices.
*/

public class CellsWithOddValues {

    public static int oddCells(int n, int m, int[][] indices) {

        int counter = 0;




        return counter;
    }


    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0, 1}, {1, 1}}));
    }
}
