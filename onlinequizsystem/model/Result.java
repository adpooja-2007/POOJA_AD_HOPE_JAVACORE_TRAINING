package onlinequizsystem.model;

public class Result {
    private String studentName;
    private int score;
    private int total;

    public Result(String studentName, int score, int total) {
        this.studentName = studentName;
        this.score = score;
        this.total = total;
    }

    public void displayResult() {
        System.out.println("\nStudent: " + studentName);
        System.out.println("Score: " + score + "/" + total);
    }
}