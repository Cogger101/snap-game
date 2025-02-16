public class Player {
    private Player player1;
    private Player player2;
    private String name;
    private String turn;

    public Player(String name) {
        this.name = name;
        this.turn = turn;
    }

    public String getName() {
        return name;
    }

    public String setTurn(String turn) {
        this.turn = turn;
    }
}
