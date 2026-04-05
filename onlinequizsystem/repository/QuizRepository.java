package onlinequizsystem.repository;

import onlinequizsystem.model.Quiz;
import java.util.*;

public class QuizRepository {
    private Map<String, Quiz> storage = new HashMap<>();

    public void saveQuiz(Quiz quiz) {
        storage.put(quiz.getTitle(), quiz);
    }

    public Quiz getQuiz(String title) {
        return storage.get(title);
    }
}