import java.util.ArrayList;

public class CardGame {
    public ArrayList<Card> deckOfCards;

    public CardGame(){
        deckOfCards = new ArrayList<>();
        createDeck();
    }

    private void createDeck(){
        String[] suits = {"hearts", "clubs", "diamonds", "spades" };
        String[] symbols = {"2", "3", "4", "5", "6", "7","8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit: suits){
            for (int i =0; i < symbols.length; i++){
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }



}
