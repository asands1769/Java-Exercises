package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search within the Alice quote: ");
        String userTerm = input.nextLine().toLowerCase();
        if (aliceQuote.toLowerCase().contains(userTerm)){
            System.out.println("The search term was found.");
        }
        else {
            System.out.println("The search term was not found");
        }
        int index = aliceQuote.indexOf(userTerm);
        int length = userTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String newQuote = aliceQuote.replace(userTerm, "");
        System.out.println(newQuote);
    }
}
