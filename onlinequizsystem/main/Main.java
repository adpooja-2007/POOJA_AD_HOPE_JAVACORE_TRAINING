package onlinequizsystem.main;

import onlinequizsystem.model.*;
import onlinequizsystem.service.*;
import onlinequizsystem.repository.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = sc.nextLine();

        Student student = new Student(101, studentName);
        student.login();

        Quiz quiz = new Quiz("OOP Quiz");

        quiz.addQuestion(new MCQQuestion(
                "Which concept allows multiple forms?",
                2,
                Arrays.asList("A. Polymorphism", "B. Inheritance"),
                "A"
        ));

        quiz.addQuestion(new MCQQuestion(
                "Which is used to achieve abstraction?",
                2,
                Arrays.asList("A. Interface", "B. Variable"),
                "A"
        ));

        quiz.addQuestion(new MCQQuestion(
                "Which keyword is used for inheritance?",
                2,
                Arrays.asList("A. extends", "B. implements"),
                "A"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "Java supports multiple inheritance using classes (true/false)",
                2,
                "false"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "Polymorphism improves code flexibility (true/false)",
                2,
                "true"
        ));

        QuizRepository repo = new QuizRepository();
        repo.saveQuiz(quiz);

        QuizService service = new QuizService();
        List<String> userAnswers = new ArrayList<>();

        System.out.println("\n--- Start Quiz ---");

        for (Question q : quiz.getQuestions()) {
            System.out.println("\n" + q.getQuestionText());

            if (q instanceof MCQQuestion) {
                for (String opt : ((MCQQuestion) q).getOptions()) {
                    System.out.println(opt);
                }
                System.out.print("Enter A or B: ");
            } 
            else if (q instanceof TrueFalseQuestion) {
                System.out.print("Enter True or False: ");
            }

            String ans = sc.nextLine();
            userAnswers.add(ans);
        }

        Result result = service.evaluateQuiz(quiz, userAnswers, studentName);
        result.displayResult();

        sc.close();
    }
}