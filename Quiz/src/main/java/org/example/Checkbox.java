package org.example;

public class Checkbox extends Question {

    private String correctAnswers;

    public Checkbox(String questionString, String correctAnswers) {
        super(questionString);
        this.correctAnswers = correctAnswers;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public boolean checkUserAnswerAccuracy(String userAnswers){
        int correctCheck = 0;
        char[] userAnswerArray = userAnswers.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] correctAnswerArray = this.correctAnswers.toLowerCase().toCharArray();
        for (char answer: correctAnswerArray){
            for (char userAnswer: userAnswerArray)
            if (answer == userAnswer){
                correctCheck++;
            }
        }
        if (correctCheck == correctAnswerArray.length && userAnswerArray.length == correctAnswerArray.length){
            return true;
        }
        return false;
    }

}
