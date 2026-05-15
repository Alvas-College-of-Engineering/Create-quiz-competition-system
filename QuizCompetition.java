import java.util.Scanner;

class Question {

    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int correctAnswer;

    Question(String question,
             String option1,
             String option2,
             String option3,
             String option4,
             int correctAnswer) {

        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
    }

    void displayQuestion() {

        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }

    boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }
}

public class QuizCompetition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== QUIZ COMPETITION SYSTEM =====");

        System.out.print("Enter Participant Name: ");
        String name = sc.nextLine();

        int score = 0;

        Question q1 = new Question(
                "Which language is used for Android Development?",
                "Python",
                "Java",
                "PHP",
                "C",
                2
        );

        Question q2 = new Question(
                "Who developed Java?",
                "Google",
                "Microsoft",
                "Sun Microsystems",
                "Apple",
                3
        );

        Question q3 = new Question(
                "Which keyword is used for inheritance?",
                "this",
                "super",
                "extends",
                "final",
                3
        );

        Question[] questions = {q1, q2, q3};

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));

            questions[i].displayQuestion();

            System.out.print("Enter Answer: ");

            int answer = sc.nextInt();

            if (questions[i].checkAnswer(answer)) {

                System.out.println("Correct!");
                score++;

            } else {

                System.out.println("Wrong!");
            }
        }

        System.out.println("\n===== FINAL RESULT =====");

        System.out.println("Participant Name : " + name);

        System.out.println("Score            : " + score + "/" + questions.length);

        if (score >= 2) {

            System.out.println("Result           : PASS");

        } else {

            System.out.println("Result           : FAIL");
        }

        sc.close();
    }
}
