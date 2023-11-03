package number_guesser;

public class NumberGuesser {
    Integer secretNumber;
    public NumberGuesser(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public String guess(int guessNumber) {
        if (guessNumber > this.secretNumber) {
            return "lower";
        } else if (guessNumber < this.secretNumber) {
            return "higher";
        } else {
            return "correct!";
        }
    }
}
