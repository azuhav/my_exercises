package leetcode;

public class LongestCommonPrefixFast {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
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
