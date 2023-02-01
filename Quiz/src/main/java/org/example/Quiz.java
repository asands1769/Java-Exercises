package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Quiz {

    private static ArrayList<Question> quizQuestions = new ArrayList<>();
    private static double scorePercentage;
    public static ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public static double getScorePercentage() {
        return scorePercentage;
    }

    public static void setScorePercentage(double score) {
        scorePercentage = score;
    }

    public static void addQuizQuestion(Question question){
        quizQuestions.add(question);
    }


    public static void startQuiz(){
        int score = 0;
        MultipleChoice dotNotation = new MultipleChoice("To call a method on a class without creating an instance of an object using dot notation, the method must be what? \n  A: Static     B: Private \n  C: Final     D: Not possible", "A");
        Checkbox hashMapMethods = new Checkbox("Which of the following are methods of the HashMap collection?  You can enter multiple answers.  \n  A: clone()   B: clear() \n  C: entrySet() D: valueSet()", "abc");
        TrueOrFalse methodsInClasses = new TrueOrFalse("Methods cannot stand on their own—they must be part of a class.  True or False", true);
        Quiz.addQuizQuestion(dotNotation);
        Quiz.addQuizQuestion(hashMapMethods);
        Quiz.addQuizQuestion(methodsInClasses);
        Scanner input = new Scanner(System.in);
        for (Question question: quizQuestions){
            System.out.println(question.getQuestionString());
            String answer = input.nextLine();
            if (question.checkUserAnswerAccuracy(answer)) {
                score++;
            }
        }
        double percentage = score / quizQuestions.size();
        percentage = percentage * 100;
        Quiz.setScorePercentage(percentage);
        System.out.println("You got " + score + " questions correct out of " + quizQuestions.size() + ".  Your percentage was " + Quiz.getScorePercentage() + "%.");

    }

}

