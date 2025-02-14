import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CardGame {
    private final ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(String name){
        this.name = name;
        this.deckOfCards = new ArrayList<>();
    }

    public void createDeck(){
        String[] suits = {"♡", "♢", "♠", "♣" };
        String[] symbols = {"2", "3", "4", "5", "6", "7","8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit: suits){
            for (int i =0; i < symbols.length; i++){
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }

    public void printDeck(){
        for (Card card: deckOfCards){
            System.out.println(card);
        }
    };

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public Card dealCard(){
        if (deckOfCards.isEmpty()){
            throw new IllegalStateException("The deck is empty!");
        }
//        System.out.println("first card in the deck ==>" + deckOfCards.removeFirst());
         return deckOfCards.removeFirst();
        }

        public void sortDeck(CardSorting sortingType) {
            switch(sortingType) {
                case byValue:
                    deckOfCards.sort((a,b) -> a.getValue() - b.getValue());
                    break;
                case bySuit:
                    deckOfCards.sort((a,b)-> a.getSuit().compareTo(b.getSuit()));
                    break;
                default:
            }
        };

        public void shuffleDeck(){
          Collections.shuffle(deckOfCards);
        }

}
