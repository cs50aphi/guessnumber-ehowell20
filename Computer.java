public class Computer
{
    public int play(int result, int max)
    {
        // guess
        int compGuess = max / 2;
        // print if guess too high or low
        if (result == 1)
        {
            System.out.println("Too high");
            compGuess--;
        }
        else if (result == -1)
        {
            System.out.println("Too low");
            compGuess++;
        }
        return compGuess;
    }
}