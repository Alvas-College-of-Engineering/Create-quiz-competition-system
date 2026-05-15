import java.util.*;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int startQuiz(Scanner sc) {
        int score = 0;

        System.out.println("\nStarting Quiz...\n");

        for (Question q : questions) {
            q.displayQuestion();

            System.out.print("Enter your answer (A/B/C/D): ");
            char ans = Character.toUpperCase(sc.next().charAt(0));

            if (q.checkAnswer(ans)) {
                System.out.println("Correct Answer!\n");
                score++;
            } else {
                System.out.println("Wrong Answer!\n");
            }
        }

        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}
