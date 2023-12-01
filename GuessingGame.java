import java.util.*;

public class GuessingGame
{
    // instance variables
    private int number;      // the random number
    private int myGuess;     // current guess
    private int numGuesses;  // number of guesses
    
    Random random = new Random();

    private Scanner keyboard = new Scanner(System.in);

    /** generates a random number in the range of
     *  1 to 100 inclusive.
     */
    public void generateNumber()
    {
        number = random.nextInt(100);
        
    }

    /** Displays a prompt asking player to make a guess. It
     *  reads the guess and stores it in the variable
     *  myGuess. It also increments the variable numGuesses.
     */
    public void makeGuess()
    {
        while (myGuess != number){

        System.out.println("Guess a number from 1 to 100");
            myGuess = keyboard.nextInt();
            winner();
                numGuesses++;
        }
    }

    /* Determines whether player's guess was correct. If
     * myGuess was a match it returns true. If myGuess was
     * less than number then it displays the message
     * "Too Low, Try Again!" and returns false. If myGuess
     *  was greater than number then it displays the
     *  message "Too High, Try Again!" and returns false.
     */
    public boolean winner()
    {
        if (myGuess < 1){
            System.out.println("Not a valid number. Try again.");
                return false;
        }
        if (myGuess > 100){
            System.out.println("Not a valid number. Try again.");
                return false;
        }
        if (myGuess < number){
            System.out.println("Too low. Try again.");
                return false;
        }
        if (number < myGuess){
            System.out.println("Too high. Try again.");
                return false;
        }
        return true;
    }
	
    /** Generates the random number then allows the player to
     *  continually guess the random number until it is found.
     *  Once the number is found it displays a message
     *  indicating how many guesses it took to find the
     *  number.
     */
    public void playGame()
    {
        generateNumber();
        makeGuess();
        System.out.println("Congrats! It took " + numGuesses + " guesses.");
    }

    public static void main (String[] args)
    {
        GuessingGame app = new GuessingGame();
        app.playGame();
    }
}