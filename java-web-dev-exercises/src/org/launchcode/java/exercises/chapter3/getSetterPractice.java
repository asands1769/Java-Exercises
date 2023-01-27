package org.launchcode.java.exercises.chapter3;

public class getSetterPractice {
    private String name;
    private int studentID;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }
    public static void main(String[] args){
        constructorPractice goodbye = new constructorPractice("Goodbye World");
        System.out.println(goodbye.getMessage());
        goodbye.setMessage("Testing");
        System.out.println(goodbye.getMessage());
    }


}
