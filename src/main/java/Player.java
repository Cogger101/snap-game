public class Player {

    private String name;
    private boolean turn;

    public Player(String name) {
        this.name = name;
        this.turn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}
