package qa.edu.qu.cmps312.ilearn;

public class Question {
    private String question;
    private String[] choices;
    private int answer;
    private String category;

    public Question(String question, String[] choices, int answer, String category) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
        this.category = category;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAnswerCorrect(String answer) {
        for (String choice : this.choices)
            if (choice.equals(answer))
                return true;
        return false;
    }
}
