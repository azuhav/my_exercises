package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {

    public static int romanToInt(String s) {
        Map<String, Integer> mapSingles = new HashMap<>();

        int summation = 0;

        mapSingles.put("I", 1);
        mapSingles.put("V", 5);
        mapSingles.put("X", 10);
        mapSingles.put("L", 50);
        mapSingles.put("C", 100);
        mapSingles.put("D", 500);
        mapSingles.put("M", 1000);

        Map<String, Integer> mapDoubles = new HashMap<>();

        mapDoubles.put("IV", 4);
        mapDoubles.put("IX", 9);
        mapDoubles.put("XL", 40);
        mapDoubles.put("XC", 90);
        mapDoubles.put("CD", 400);
        mapDoubles.put("CM", 900);



        StringBuilder temp = new StringBuilder(s);

        for (String doubleKey : mapDoubles.keySet()) {
            if (temp.indexOf(doubleKey) > - 1) {
                while (temp.indexOf(doubleKey) > - 1) {
                    summation += mapDoubles.get(doubleKey);
                    temp.replace(temp.indexOf(doubleKey), temp.indexOf(doubleKey)+1, "");
                }
            }
        }

        for (String singleKey : mapSingles.keySet()) {
            for (int x = 0; x < temp.length(); x++) {
                if (singleKey.equals(String.valueOf(temp.charAt(x)))) summation += mapSingles.get(singleKey);
            }
        }

        return summation;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCVI"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}