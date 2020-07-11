package leetcode;
/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a
direct path going from cityAi to cityBi. Return the destination city, that is, the city
without any path outgoing to another city.
It is guaranteed that the graph of paths forms a line without any loop, therefore,
there will be exactly one destination city.

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the
destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 */

import java.util.ArrayList;
import java.util.List;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {

        if (paths.size() == 1) return paths.get(0).get(1);

        String city = "";

        ArrayList<String> arr = new ArrayList<>();

        for (List<String> li : paths) {
            String temp = li.get(0);
            arr.add(temp);
        }

        for (List<String> l : paths) {
            String temp = l.get(1);
            if (!arr.contains(temp)) city = temp;
        }
        return city;
    }


    public static void main(String[] args) {

    }
}
