public class Participant {
    private int participantId;
    private String participantName;

    public Participant(int participantId, String participantName) {
        this.participantId = participantId;
        this.participantName = participantName;
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getParticipantName() {
        return participantName;
    }
}
