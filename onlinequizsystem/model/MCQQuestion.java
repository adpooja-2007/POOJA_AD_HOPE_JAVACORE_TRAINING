package onlinequizsystem.model;

import java.util.*;

public class MCQQuestion extends Question {
    private List<String> options;
    private String correctAnswer;

    public MCQQuestion(String questionText, int marks, List<String> options, String correctAnswer) {
        super(questionText, marks);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}