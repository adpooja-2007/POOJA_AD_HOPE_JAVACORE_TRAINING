package onlinequizsystem.model;

import java.util.*;

public class Quiz {
    private String title;
    private List<Question> questions;

    public Quiz(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        if (q == null) {
            throw new IllegalArgumentException("Question cannot be null");
        }
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return Collections.unmodifiableList(questions);
    }

    public String getTitle() {
        return title;
    }
}