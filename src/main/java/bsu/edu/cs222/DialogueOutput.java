package bsu.edu.cs222;

import static java.lang.System.exit;

public class DialogueOutput {
    public static void instructions(){
        System.out.println("Please enter in a number between 1 and 3000");
    }
    public static void ResultOutput(String result){
        System.out.println(result);
    }
    public static void OutOfRangeDialogue(){
        System.out.println("Number out of range");
        exit(0);
    }
}
