import java.util.*;
public class Game 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int Guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        while (Guess != number)
         {
            System.out.print("Enter your guess: ");
            Guess = scanner.nextInt();
            attempts++;

            if (Guess < number)
             {
                System.out.println("Too low. Try again.");
            }
             else if (Guess > number) 
            {
                System.out.println("Too high! Try again.");
            } 
            else 
            {
                System.out.println(" Correct You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}