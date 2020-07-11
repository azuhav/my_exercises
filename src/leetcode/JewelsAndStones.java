package leetcode;

public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {

        int jewels = 0;


        for (char ch : J.toCharArray()) {
            for (char cha : S.toCharArray()) {
                if (ch == cha) jewels++;
            }
        }


        return jewels;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
