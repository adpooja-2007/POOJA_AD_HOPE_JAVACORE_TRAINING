package onlinequizsystem.model;

public abstract class Question {
    private String questionText;
    private int marks;

    public Question(String questionText, int marks) {
        this.questionText = questionText;
        this.marks = marks;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getMarks() {
        return marks;
    }

    public abstract boolean checkAnswer(String userAnswer);
}