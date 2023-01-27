package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student Adam = new Student();
        Adam.getGpa();
        Adam.getName();
        Adam.getstudentId();
        Adam.getNumberOfCredits();
        Adam.setGpa(4.0);
        Adam.setstudentId(12345);
        Adam.setName("Adam Sands");
        Adam.setNumberOfCredits(1);
        System.out.println(Adam.getstudentId());
        // Instantiate your Student class for part 2 here!
    }
}
