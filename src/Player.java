import java.util.Scanner;

public class Player{
   
   
    public static int score = 0;

    public static int userInput(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Välj mellan 1:sten 2:sax eller 3:påse:  ");
        int input = myScanner.nextInt();
        return  input;
       
        
        
    }
    

    public static String  playAgain(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("vill du spela igen(Y för yes: och N för Nej:");
        String input = myScanner.nextLine();
        String play = input.toUpperCase();
        return play;
    }
    
}