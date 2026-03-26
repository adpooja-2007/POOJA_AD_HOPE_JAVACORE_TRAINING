class LEETCODE1678 {

    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    public static void main(String[] args) {
        LEETCODE1678 obj = new LEETCODE1678();

        String input = "G()(al)";
        String result = obj.interpret(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}