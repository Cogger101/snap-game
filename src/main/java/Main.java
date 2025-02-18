import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gameResetScanner = new Scanner(System.in);
        boolean playAgain = true;

        while(playAgain){
        Snap game = new Snap("Snap");
        game.playGame();

            System.out.println("Would you like to play again? (yes/no)");
            String input = gameResetScanner.nextLine().toLowerCase();

            if (!input.equals("yes")){
                playAgain = false;
            }

        }
        System.out.println("Thanks for playing!!");
        gameResetScanner.close();
    }
}