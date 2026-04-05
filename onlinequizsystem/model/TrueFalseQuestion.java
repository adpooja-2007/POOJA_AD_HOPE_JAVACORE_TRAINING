package onlinequizsystem.model;

public class TrueFalseQuestion extends Question {
    private String correctAnswer;

    public TrueFalseQuestion(String questionText, int marks, String correctAnswer) {
        super(questionText, marks);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}