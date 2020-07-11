package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = "";

        if (strs.length == 1) prefix = strs[0];

        else if (strs.length > 1) {

            Arrays.sort(strs);

            String sample = strs[0];

            for (String s : strs) {
                if (s.length() < 1) continue;
                if (s.length() == 1 & !s.equals(sample)) {
                    prefix = "";
                    continue;
                }


                int index = sample.length();

                if (s.equals(sample)) prefix = sample;

                else {
                    while (!s.startsWith(sample)) {
                        if (sample.length() == 0) {
                            prefix = "";
                            continue;
                        }
                        sample = sample.substring(0, index--);
                        System.out.println("sample = " + sample + ", s = " + s);
                        prefix = sample;

                    }
                }
            }

        }
        return prefix;
    }


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a", "b"}));
        System.out.println(longestCommonPrefix(new String[]{"aa", "a"}));
        System.out.println(longestCommonPrefix(new String[]{"aa", "ab"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix(new String[]{"c", "c"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
