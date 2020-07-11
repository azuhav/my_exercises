package leetcode;

public class PalindromNumberMy {

    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int pal = 0;
        int temp = x;
        while (temp != 0) {
            int pop = temp % 10;
            System.out.println("pop = " + pop);
            temp /=10;
            pal = pal * 10 + pop;
            System.out.println(x);
        }

        return pal == x;

    }

    public static void main(String[] args) {
        System.out.println(new PalindromNumberMy().isPalindrome(121));
    }
}
