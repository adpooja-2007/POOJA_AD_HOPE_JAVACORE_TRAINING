class LEETCODE6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += cycle) {
                result.append(s.charAt(j));

                if (i != 0 && i != numRows - 1) {
                    int diagonal = j + cycle - 2 * i;
                    if (diagonal < s.length()) {
                        result.append(s.charAt(diagonal));
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}