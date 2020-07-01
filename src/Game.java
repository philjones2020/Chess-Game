import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2){
        players[0] = p1;
        players[1] = p2;

        board.resetBoard();

        if(p1.isWhiteSide()){
            this.currentTurn = p1;
        }
        else{
            this.currentTurn = p2;
        }

        movesPlayed.clear();
    }

    public boolean isEnd(){
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(GameStatus status){
        this.status = status;
    }


}
