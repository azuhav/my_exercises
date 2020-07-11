package leetcode;
/*
On a plane there are n points with integer coordinates points[i] = [xi, yi].
Your task is to find the minimum time in seconds to visit all points.

You can move according to the next rules:

In one second always you can either move vertically, horizontally by one unit or diagonally
(it means to move one unit vertically and one unit horizontally in one second).
You have to visit the points in the same order as they appear in the array.
 */

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {

        int count = 0;

        for (int y = 1; y < points.length; y++) {
            int X = Math.abs(points[y][0] - points[y - 1][0]);
            int Y = Math.abs(points[y][1] - points[y - 1][1]);
            count += Math.max(X, Y);
        }

        return count;
    }
}
