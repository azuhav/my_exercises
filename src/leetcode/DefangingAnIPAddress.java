package leetcode;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

        A defanged IP address replaces every period "." with "[.]".



        Example 1:

        Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"
*/
public class DefangingAnIPAddress {

    public static String defangIPaddr(String address) {
        /*
        address = address.replaceAll("\\.", "[.]");
        return address;
        */


        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
