package cracking;

public class IsPrime {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

}

