package org.example;

public abstract class Question {


    private String questionString;
private boolean isCorrect;

public Question(String questionString){
    this.questionString = questionString;
}

    public String getQuestionString() {
        return questionString;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }

    public abstract boolean checkUserAnswerAccuracy(String userAnswer);

}