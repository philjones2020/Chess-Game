import java.util.Comparator;

public abstract class Player {
    public boolean whiteSide;
    public boolean human;

    public boolean isWhiteSide(){
        return this.whiteSide == true;
    }

    public boolean isHuman(){
        return this.human == true;
    }

    public class HumanPlayer extends Player {
        public HumanPlayer(boolean whiteSide) {
            this.whiteSide = whiteSide;
            this.human = true;
        }
    }

    public class ComputerPlayer extends Player {
        public ComputerPlayer(boolean whiteSide){
            this.whiteSide = whiteSide;
            this.human = false;
        }
    }
}
