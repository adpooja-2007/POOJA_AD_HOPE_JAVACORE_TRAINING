public class LEETCODE1108 {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        LEETCODE1108 solution = new LEETCODE1108();

        String ip1 = "1.1.1.1";
        System.out.println(solution.defangIPaddr(ip1));

        String ip2 = "255.100.50.0";
        System.out.println(solution.defangIPaddr(ip2));
    }
}