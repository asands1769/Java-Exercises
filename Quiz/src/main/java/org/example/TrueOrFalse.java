package org.example;

public class TrueOrFalse extends Question {

    private boolean correctAnswer;

    public TrueOrFalse(String questionString, boolean correctAnswer) {
        super(questionString);
        this.correctAnswer = correctAnswer;
    }

    public Boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public boolean checkUserAnswerAccuracy(String userAnswer){
        boolean userBoolean = Boolean.parseBoolean(userAnswer);
        if(userBoolean == isCorrectAnswer()){
            return true;
        }
        return false;
    }
}
