import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

public class Snap extends CardGame {
Scanner keyboard = new Scanner(System.in);
String playerShuffleDeck;
Card lastCard;
Card prevCard;
Player playerOne;
Player playerTwo;



    public Snap(String name) {
        super(name);
        playerOne = new Player("Player 1");
        playerTwo = new Player("Player 2");
    }

    public void initialiseGame() {
        createDeck();
        System.out.println("Game has started!!");
        System.out.println("Would you like to shuffle the deck? (yes/no):");
        playerShuffleDeck = keyboard.nextLine().toLowerCase();

        if (playerShuffleDeck.equals("yes")) {
            shuffleDeck();
            System.out.println("Deck shuffled!");
        }
    }

    public void playGame() {
//        Snap newGame = new Snap("Phil");
    playerOne.setTurn(true);
        while (!getDeckOfCards().isEmpty()) {
            Player currentPlayer = playerOne.isTurn() ? playerOne : playerTwo;

            System.out.println(currentPlayer.getName() + " - Press enter to draw a card");
            keyboard.nextLine();
            prevCard = lastCard;
            lastCard = dealCard();
            System.out.printf("Your card is: %s \n", lastCard.toString());
            // check that the snap conditions have been met
            if (cardMatchSnap()){
//                throw new IllegalStateException("SNAP!! We have a match!");
                System.out.println("SNAP!! We have a match! " + currentPlayer.getName().toUpperCase() + " WINS");
                break;
            }

            playerOne.setTurn(!playerOne.isTurn());
            playerTwo.setTurn(!playerTwo.isTurn());
        }
            keyboard.close();
        System.out.println("GAME OVER!");
    }
    public boolean cardMatchSnap(){
     if ( lastCard != null && prevCard != null){
         return lastCard.getValue() == prevCard.getValue();
     }
        return false;
    }
//    void playTurn


    public void runSnap(){
        //All Snap require methods
    }
}
        // Constructor call should be left to the Main method
        // Method calls even in sout will execute the method once - ie here one card would have been removed from deck along the printing
        // The class can have global / class field to allow to keep track of variables that we need in different methods
        // When using library methods double check return type and see if you are actually getting anything from them or void
