public class King extends Piece {
    private boolean castlingDone = false;

    public King(boolean white){
        super(white);
    }

    public boolean isCastlingDone(){
        return this.castlingDone == true;
    }

    public void setCastlingDone(boolean castlingDone){
        this.castlingDone = castlingDone;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        //Logic for normal moves
        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board, Spot start, Spot end){
        if(this.isCastlingDone()) {
            return false;
        }
        //Some more logic
        return true;
    }

    public boolean isCastlingMove(Spot start, Spot end){
        //Castling Logic
        return true;
    }
}
