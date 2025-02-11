public class Card {
    private String suit;
    private String symbol;
    private int value;


// Constructor initialing the card
    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }
// Getters for card attributes
    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }
// Method to represent a card
    @Override
    public String toString() {
        return symbol + suit;
    }
}
