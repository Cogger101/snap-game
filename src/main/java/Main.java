public class Main {
    public static void main(String[] args) {

        CardGame game = new CardGame("Snap");
//        game.getDeck();
//        game.dealCard();
//        System.out.println(game.sortDeckInNumberOrder());
//        System.out.println(game.sortDeckIntoSuits());
        System.out.println(game.shuffleDeck());
    }
}