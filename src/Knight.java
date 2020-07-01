public class Knight extends Piece{
    public Knight(boolean white){
        super (white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
