import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  
  public static void main(String[] args)  {
    
    Random rand = new Random();
    int randomNumber = rand.nextInt(100);
    int numberOfGuesses = 0;
    int gate = 0;
    Scanner input = new Scanner(System.in);
    int guess;
    
    System.out.println("Enter your name:");
    String userName = input.nextLine();
    System.out.println("Guess a number 1-100: ");
    guess = input.nextInt();
    
    while (gate != 1) {
      if (guess == randomNumber) {
        System.out.println("Well Done " + userName + "!");
        System.out.println("Number of Guesses:");
        System.out.println(numberOfGuesses);
        gate = 1;
      }
      while (randomNumber != guess) {
        if (guess > randomNumber) {
          System.out.println("Think Lower");
          System.out.println("Guess Again:");
          guess = input.nextInt();
          numberOfGuesses++;
        } else {
          System.out.println("Think Higher");
          System.out.println("Guess Again:");
          guess = input.nextInt();
          numberOfGuesses++;
      
    }
    
  }
  
}
    
  }
  
}

//I used this website (https://www.java-made-easy.com/guessing-game.html) to help me with using scanners, but the code itself is wholey original. In fact, it was simply repurposed Python code from when we did it in IT Launch.
    
  
