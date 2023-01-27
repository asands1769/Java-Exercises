package org.launchcode.java.exercises.chapter3;

public class constructorPractice {
    private String message = "Hello world";
    public constructorPractice(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String aMessage){
        message = aMessage;
    }
}
