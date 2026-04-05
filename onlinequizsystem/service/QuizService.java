package onlinequizsystem.service;

import onlinequizsystem.model.*;
import java.util.*;

public class QuizService {

    public Result evaluateQuiz(Quiz quiz, List<String> answers, String studentName) {
        List<Question> questions = quiz.getQuestions();

        if (answers.size() != questions.size()) {
            throw new IllegalArgumentException("Answers count mismatch");
        }

        int score = 0;
        int total = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            if (q.checkAnswer(answers.get(i))) {
                score += q.getMarks();
            }

            total += q.getMarks();
        }

        return new Result(studentName, score, total);
    }
}