
public class QAData {
    private String question;
    private String answer;

    public QAData() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QAData(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }
}
