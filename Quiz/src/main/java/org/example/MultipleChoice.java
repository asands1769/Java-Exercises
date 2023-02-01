package org.example;

public class MultipleChoice extends Question {
    private String correctAnswer;

    public MultipleChoice(String questionString, String correctAnswer){
        super(questionString);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean checkUserAnswerAccuracy(String userAnswer) {
        if(userAnswer.toLowerCase().trim().equals(correctAnswer.toLowerCase())){
            return true;
        }
        return false;
    }
}
