public class Result {
    private Participant participant;
    private int score;
    private int totalQuestions;

    public Result(Participant participant, int score, int totalQuestions) {
        this.participant = participant;
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public void displayResult() {
        System.out.println("==============================");
        System.out.println("         FINAL RESULT");
        System.out.println("==============================");

        System.out.println("Participant ID   : " + participant.getParticipantId());
        System.out.println("Participant Name : " + participant.getParticipantName());
        System.out.println("Score            : " + score + "/" + totalQuestions);

        double percentage = ((double) score / totalQuestions) * 100;

        System.out.println("Percentage       : " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade            : Excellent");
        } else if (percentage >= 60) {
            System.out.println("Grade            : Good");
        } else if (percentage >= 40) {
            System.out.println("Grade            : Average");
        } else {
            System.out.println("Grade            : Needs Improvement");
        }
    }
}
