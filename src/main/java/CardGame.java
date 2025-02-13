import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CardGame {
    private final ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(String name){
        this.name = name;
        deckOfCards = new ArrayList<>();
        createDeck();
    }

    private void createDeck(){
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
    public void getDeck(){
        for (Card card: deckOfCards){
            System.out.println(card);
        }
    };

    public Card dealCard(){
        if (deckOfCards.isEmpty()){
            System.out.println("The deck is empty!");
            return null;
        }
        System.out.println("first card in the deck ==>" + deckOfCards.removeFirst());
         return deckOfCards.removeFirst();
        }


        public List<Card> sortDeckInNumberOrder(){
        deckOfCards.sort((a,b) -> a.getValue() - b.getValue());
        return deckOfCards;
        }

        public List<Card> sortDeckIntoSuits(){
        deckOfCards.sort((a,b)-> a.getSuit().compareTo(b.getSuit()));
//            System.out.println(deckOfCards);
        return deckOfCards;
        }

        public List<Card> shuffleDeck(){
          Collections.shuffle(deckOfCards);

            return deckOfCards;
        }

}
