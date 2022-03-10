package SoftwareAG;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class SoftwareAG{

    // program execution starts here
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(); // create an object for the Guess game
        game.startGame(); // start the game
    }
}


class GuessNumber{
    private String userName;
    private int score;
    private int numberOfDigits;
    private int numberOfSeconds;
    private int curNumber;
    private int guessNumber;
    private boolean isInAutoPilotMode;
    private int autoPilotStreak;
    private Random random;
    private TerminalCleaner terminalCleaner;
    private Scanner scanner;


    // constructor 
    public GuessNumber(){
        random = new Random();
        terminalCleaner = new TerminalCleaner();
    }

    // get the initial inputs from the user 
    private void getInitialInputs(){
        scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        userName = scanner.nextLine();
        System.out.print("Enter the number of digits : ");
        numberOfDigits = scanner.nextInt();
        System.out.print("Enter the number of seconds (default 3 seconds): ");
        scanner.nextLine();
        String seconds = scanner.nextLine();
        try{
            numberOfSeconds = Integer.parseInt(seconds);

            // defaults to 3 seconds if number of seconds is less than or equal to 0
            if(numberOfSeconds <= 0) numberOfSeconds = 3;
        }catch(Exception e){
            // default to 3 seconds
            numberOfSeconds = 3;
        }
        while(true){
            System.out.print("Enable auto pilot mode ( 'yes' or 'no' ) : ");
            String decision = scanner.nextLine();
            if(decision.equals("yes")){
                isInAutoPilotMode = true;
                break;
            }else if(decision.equals("no")){
                isInAutoPilotMode = false;
                break;
            }
        }
        // clears the terminal after getting all the inputs
        terminalCleaner.clean();
    }

    // starts the game
    public void startGame(){
        getInitialInputs();

        // continue playing the game unless the user wants to end
        boolean continueGame = true;
        while(continueGame){
            showNumberAndWait();
            continueGame = playAnotherGame();

            // clean the terminal after each game
            terminalCleaner.clean();
        }

        //display result
        showResult();
    }

    // asks the user if they want to continue the game
    private boolean playAnotherGame(){
        // displays the current score to the user
        System.out.println("Your current score : " + score);

        // clear the buffer
        scanner.nextLine();
        while(true){
            System.out.print("Do you want to continue ( 'yes' or 'no' ) : ");
            String decision = scanner.nextLine();
            if(decision.equals("yes")){
                return true;
            }else if(decision.equals("no")){
                return false;
            }
        }
    }

    // shows an random number for a given number of seconds
    // clears the terminal after the given amount of time
    // gets the guess from the user
    // creates result based on the guess
    // update the score based on the result
    private void showNumberAndWait(){
        // generates and show an random number
        curNumber = getRandomNumber();
        System.out.println("Memorize the following number");
        System.out.println(curNumber);

        // sleeps for given amount of time
        // note: numberOfSeconds can be accessed inside the sleep function
        sleep();

        //clears the terminal
        terminalCleaner.clean();

        // gets the user guess
        System.out.print("Enter your guess : ");
        guessNumber = scanner.nextInt();

        // generates result based on the gus
        boolean isCorrect = verifyGuessNumber();

        // update the score based on the result
        System.out.println(isCorrect? "Correct" : "Incorrect");
        score += isCorrect ?  1 : -1;

        // do auto pilot operations when auto pilot mode is enabled
        if(isInAutoPilotMode) autoPilot(isCorrect);
    }

    // display the result to the user after the game ends
    private void showResult(){
        terminalCleaner.clean();
        System.out.println("Hello " + userName + "! You have scored " + score + " points");
    }

    // return if the guess is correct or not
    private boolean verifyGuessNumber(){
        return curNumber == guessNumber;
    }

    // make the program sleep for the given number of seconds
    private void sleep() {
        try {
            Thread.sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // generates a random number with the current number of digits
    private int getRandomNumber() {
        int low = (int) Math.pow(10, this.numberOfDigits - 1);
        int high = (int) Math.pow(10, this.numberOfDigits);
        int result = random.nextInt(high - low) + low;
        return result;
    }


    private void autoPilot(boolean isCorrect){
        // update the auto pilot streak to 0 when 
            // an correct answer after one or more wrong answers
            // an wrong answer after one or more right answer
        if((!isCorrect && autoPilotStreak > 0) || (isCorrect && autoPilotStreak < 0)) autoPilotStreak = 0;
        
        // don't update the number of digits when
            // number of digits is less than or equal to 3
            // number of digits is equal to 9(to overcome overflow exception in interger)
        if((!isCorrect && numberOfDigits <= 3) || (isCorrect && numberOfDigits == 9)) return;

        // based on win or lose: 
            // update auto pilot streak points
            // update the number of digits
        autoPilotStreak += isCorrect ? 1 : -1;
        if(autoPilotStreak == 3) numberOfDigits ++;
        else if(autoPilotStreak == -3) numberOfDigits --;

        // this will make the streak stay between -3 to 3
        autoPilotStreak %= 3;
    }

}


class TerminalCleaner{

    // cleans the terminal
    public void clean(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
}