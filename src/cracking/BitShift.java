package cracking;

public class BitShift {

    public static void main(String[] args) {

        int i = 0;
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        i |= 1;
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        i |= 0;
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        i |= 1;
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        i |= 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);



    }
}
