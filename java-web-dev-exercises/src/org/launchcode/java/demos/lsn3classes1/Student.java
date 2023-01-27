package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }
    public void setName(String aName){
        this.name = aName;
    }
    public int getstudentId(){
        return studentId;
    }
    public void setstudentId(int anId){
        this.studentId = anId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int newNumberOfCredits){
        this.numberOfCredits = newNumberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double newGpa){
        this.gpa = newGpa;
    }


}