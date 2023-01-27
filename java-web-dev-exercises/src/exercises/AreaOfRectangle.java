package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("What is length of the rectangle?");
       int length = input.nextInt();
       System.out.println("What is the width of the rectangle?");
       int width = input.nextInt();
       int area = width * length;
       System.out.println("The area of your rectangle is " + area);
   }
}
