package leetcode;

import java.util.Arrays;

public class StringWithCharactersThatHaveOddCounts {
    public static String generateTheString(int n) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] st = null;

        if (n % 2 == 0) {
            st = new char[n];
            st[0] = alphabet[0];
            for (int x = 1; x < st.length; x++) {
                st[x] = alphabet[1];
            }
        } else {
            st = new char[n];
            Arrays.fill(st, alphabet[1]);
        }
        return new String(st);
    }

    public static void main(String[] args) {
        System.out.println(generateTheString(7));
    }
}
