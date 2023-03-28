package bsu.edu.cs222;


import java.util.Scanner;

public class UserInterface {
    //private static Scanner userChoice;
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
    DialogueOutput.instructions();
    String UserInput = userChoice.nextLine();
        int number=0;
    try {
        number = Integer.parseInt(UserInput);
    }
    catch(Exception e){
        DialogueOutput.IncorrectFormat();
    }
    boolean check=RomanNumeralTranslator.OutOfRangeCheck(number);
    if(!check){
        DialogueOutput.OutOfRangeDialogue();
    }
    String result = RomanNumeralTranslator.NumeralOrganizer(number);
    DialogueOutput.ResultOutput(result);
}


}
