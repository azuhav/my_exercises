package leetcode;
/*
Given a string s formed by digits ('0' - '9') and '#' .
We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 */

public class DecryptStringFromAlphabetToInteger {

    public static String freqAlphabets(String s) {

        StringBuilder sToReturn = new StringBuilder();

        for (int x = s.length() - 1; x >= 0; x--) {
            char one = s.charAt(x);
            if (one != '#') {
                sToReturn.append(convert(String.valueOf(one)));
            } else {
                String two = s.substring(x - 2, x);
                sToReturn.append(convert(two));
                x -= 2;
            }
        }

        return sToReturn.reverse().toString();

    }

    public static String convert(String st) {
        String res = "";
        switch (st) {
            case "1":
                res = "a";
                break;
            case "2":
                res = "b";
                break;
            case "3":
                res = "c";
                break;
            case "4":
                res = "d";
                break;
            case "5":
                res = "e";
                break;
            case "6":
                res = "f";
                break;
            case "7":
                res = "g";
                break;
            case "8":
                res = "h";
                break;
            case "9":
                res = "i";
                break;
            case "10":
                res = "j";
                break;
            case "11":
                res = "k";
                break;
            case "12":
                res = "l";
                break;
            case "13":
                res = "m";
                break;
            case "14":
                res = "n";
                break;
            case "15":
                res = "o";
                break;
            case "16":
                res = "p";
                break;
            case "17":
                res = "q";
                break;
            case "18":
                res = "r";
                break;
            case "19":
                res = "s";
                break;
            case "20":
                res = "t";
                break;
            case "21":
                res = "u";
                break;
            case "22":
                res = "v";
                break;
            case "23":
                res = "w";
                break;
            case "24":
                res = "x";
                break;
            case "25":
                res = "y";
                break;
            case "26":
                res = "z";
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }
}

