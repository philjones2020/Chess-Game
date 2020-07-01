public class Queen extends Piece {
    public Queen(boolean white){
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        //Logic for Queen Moves
        return true;
    }
}
