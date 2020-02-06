import java.util.Scanner;

public class Player
{
    Scanner kb = new Scanner(System.in);
    // returns player guess
    public int play(int result)
    {
        // print if guess too high or low
        if (result == 1)
        {
            System.out.println("Too high");
        }
        else if (result == -1)
        {
            System.out.println("Too low");
        }
        // saves guess
        int humanGuess = kb.nextInt();
        return humanGuess;
    }
}