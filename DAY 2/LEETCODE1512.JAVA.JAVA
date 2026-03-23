public class LEETCODE2525 {

    public String categorizeBox(int length, int width, int height, int mass) {
        final boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000
                || (long) length * width * height >= 1_000_000_000;

        final boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy)
            return "Both";
        if (isBulky)
            return "Bulky";
        if (isHeavy)
            return "Heavy";

        return "Neither";
    }

    public static void main(String[] args) {
        LEETCODE2525 obj = new LEETCODE2525();

        int length = 1000;
        int width = 35;
        int height = 700;
        int mass = 300;

        String result = obj.categorizeBox(length, width, height, mass);

        System.out.println("Category: " + result);
    }
}