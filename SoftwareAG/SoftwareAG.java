package SoftwareAG;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class SoftwareAG{
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        game.getInitialInputs();
        game.startGame();
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

    public GuessNumber(){
        random = new Random();
        terminalCleaner = new TerminalCleaner();

    }
    public void getInitialInputs(){
        scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        userName = scanner.nextLine();
        System.out.print("Enter the number of digits : ");
        numberOfDigits = scanner.nextInt();
        System.out.print("Enter the number of seconds : ");
        numberOfSeconds = scanner.nextInt();
        scanner.nextLine();
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
    }


    public void startGame(){
        boolean continueGame = true;
        while(continueGame){
            showNumberAndWait();
            continueGame = playAnotherGame();
        }
        showResult();
    }


    private boolean playAnotherGame(){
        System.out.println("Your current score : " + score);
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

    private void showNumberAndWait(){
        curNumber = getRandomNumber(numberOfDigits);
        System.out.println("Memorize the following number");
        System.out.println(curNumber);
        sleep(numberOfSeconds);
        terminalCleaner.clear();
        System.out.print("Enter your guess : ");
        guessNumber = scanner.nextInt();
        boolean isCorrect = verifyGuessNumber();
        score += isCorrect ?  1 : -1;
        if(isInAutoPilotMode) autoPilot(isCorrect);
    }

    private void showResult(){
        terminalCleaner.clear();
        System.out.println("Hello " + userName + "! You have scored " + score + " points");
    }

    private boolean verifyGuessNumber(){
        return curNumber == guessNumber;
    }


    private void sleep(int duration) { // in seconds
        try {
            Thread.sleep(duration * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private int getRandomNumber(int no_of_digits) {
        int low = (int) Math.pow(10, no_of_digits - 1);
        int high = (int) Math.pow(10, no_of_digits);
        int result = random.nextInt(high - low) + low;
        return result;
    }


    private void autoPilot(boolean isCorrect){
        if((!isCorrect && autoPilotStreak > 0) || (isCorrect && autoPilotStreak < 0)) autoPilotStreak = 0;
        
        autoPilotStreak += isCorrect ? 1 : -1;
        if((!isCorrect && numberOfDigits == 1) || (isCorrect && numberOfDigits == 9)) return;
        if(autoPilotStreak == 3) numberOfDigits ++;
        else if(autoPilotStreak == -3) numberOfDigits --;
    }

}


class TerminalCleaner{
    public void clear(){
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