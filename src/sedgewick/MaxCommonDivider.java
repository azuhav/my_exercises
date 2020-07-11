package sedgewick;

public class MaxCommonDivider {

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        System.out.println("r = " + r);
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }
}
