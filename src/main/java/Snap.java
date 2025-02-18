import java.util.*;

public class Snap extends CardGame {
Scanner keyboard = new Scanner(System.in);
String playerShuffleDeck;
Card lastCard;
Card prevCard;
Player playerOne;
Player playerTwo;
Timer timer = new Timer();
boolean cardMatchChanceToWin;



    public Snap(String name) {
        super(name);
        playerOne = new Player("Player 1");
        playerTwo = new Player("Player 2");
    }

    public void initialiseGame() {
        createDeck();
        enterPlayerNames();
        System.out.println("Game has started!!");
        System.out.println("Would you like to shuffle the deck? (yes/no):");
        playerShuffleDeck = keyboard.nextLine().toLowerCase();

        if (playerShuffleDeck.equals("yes")) {
            shuffleDeck();
            System.out.println("Deck shuffled! \nWhen 2 cards match, you will have 2 second to type 'Snap' to win!");
        }
    }

    public void enterPlayerNames() {
        System.out.println("Player One enter your name: ");
        playerOne.setName(keyboard.nextLine());
        System.out.println("Player Two enter your name: ");
        playerTwo.setName(keyboard.nextLine());
    }

    public void playGame() {
    initialiseGame();
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
                cardMatchChanceToWin = true;
                System.out.println("Looks like we have a match - Type snap in 2 second to win: ");

//            start the timer and allow the player to enter snap
            startTimer(currentPlayer);
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("snap") && cardMatchChanceToWin){
                System.out.println(currentPlayer.getName().toUpperCase() + " WINS!");
                timer.cancel();
            break;
            } else {
                System.out.println("Too slow or No matches for Snap");

            }
            cardMatchChanceToWin = false;
            timer.cancel();
            timer = new Timer();
            }

            playerOne.setTurn(!playerOne.isTurn());
            playerTwo.setTurn(!playerTwo.isTurn());
        }

        System.out.println("GAME OVER!");
    }

    public void startTimer(Player currentPlayer){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (cardMatchChanceToWin) {
                    System.out.println("You where too slow " + currentPlayer.getName());
                    cardMatchChanceToWin = false;
                }
            }
        }, 2000);
    }

    public boolean cardMatchSnap(){
     if ( lastCard != null && prevCard != null){
         return lastCard.getValue() == prevCard.getValue();
     }
        return false;
    }
    public void resetGame(){
        getDeckOfCards().clear();
        lastCard = null;
        prevCard = null;
        cardMatchChanceToWin = false;
        timer.cancel();
        timer = new Timer();
    }

}

