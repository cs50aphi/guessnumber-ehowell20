import java.util.Scanner;

public class GuessNumberDriver
{
    public static void main(String[] args)
    {
        // running total of number of guesses
        int numGuesses = 0;
        // number of player guesses
        int playerGuesses = 0;
        // nummber of computer guesses
        int compGuesses = 0;
        // max answer value
        int max = 0;
        // random number
        int answer = 0;
        // keeps track of whether game is done
        boolean won = false;
        // too high (1) or too low (-1)
        int result = 0;
        // creates new scanner
        Scanner kb = new Scanner(System.in);
        // creates new player and computer
        Player human = new Player();
        Computer computer = new Computer();
        // asks for max
        System.out.println("What would you like to play out of?");
        max = kb.nextInt();
        System.out.println("I'm thinking of a number between 1 and " + max);
        // sets answer value
        answer = (int)((Math.random() * max) + 1);
        // loops until player guesses correct
        while (!won)
        {
            // int from human move
            int guess = human.play(result);
            // prints guess
            System.out.println("Player guesses " + guess);
            // record if guess too high
            if (guess > answer)
            {
                result = 1;
                numGuesses++;
            }
            // record if guess too low
            else if (guess < answer)
            {
                result = -1;
                numGuesses++;
            }
            // win game if guess correct
            else
            {
                numGuesses++;
                playerGuesses = numGuesses;
                System.out.println("Player got it in " + numGuesses + " guesses!");
                won = true;
            }
        }
        numGuesses = 0;
        won = false;
        while (!won)
        {
            // int from human move
            int guess = computer.play(result, max);
            // prints guess
            System.out.println("Computer guesses " + guess);
            // record if guess too high
            if (guess > answer)
            {
                result = 1;
                numGuesses++;
            }
            // record if guess too low
            else if (guess < answer)
            {
                result = -1;
                numGuesses++;
            }
            // win game if guess correct
            else
            {
                numGuesses++;
                compGuesses = numGuesses;
                System.out.println("Computer got it in " + numGuesses + " guesses!");
                won = true;
            }
        }
        if (compGuesses > playerGuesses)
        {
            System.out.println("Player wins with less guesses");
        }
        else
        {
            System.out.println("Computer wins with less guesses");
        }
    }
}