import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("   QUIZ COMPETITION SYSTEM");
        System.out.println("==============================");

        System.out.print("Enter participant name: ");
        String name = sc.nextLine();

        System.out.print("Enter participant ID: ");
        int id = sc.nextInt();

        Participant participant = new Participant(id, name);

        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
                "1. Which language is used for Java programming?",
                "A. Python",
                "B. Java",
                "C. C++",
                "D. HTML",
                'B'));

        quiz.addQuestion(new Question(
                "2. Which keyword is used to create an object in Java?",
                "A. class",
                "B. public",
                "C. new",
                "D. object",
                'C'));

        quiz.addQuestion(new Question(
                "3. Which company developed Java?",
                "A. Sun Microsystems",
                "B. Microsoft",
                "C. Google",
                "D. Apple",
                'A'));

        quiz.addQuestion(new Question(
                "4. Java is a ____ language.",
                "A. Low-level",
                "B. Machine",
                "C. High-level",
                "D. Assembly",
                'C'));

        quiz.addQuestion(new Question(
                "5. Which symbol is used to end a statement in Java?",
                "A. :",
                "B. ;",
                "C. .",
                "D. #",
                'B'));

        int score = quiz.startQuiz(sc);

        Result result = new Result(participant, score, quiz.getTotalQuestions());

        result.displayResult();

        sc.close();
    }
}
