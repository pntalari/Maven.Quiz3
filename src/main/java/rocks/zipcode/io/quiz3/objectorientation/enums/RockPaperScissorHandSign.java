package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

        ROCK, PAPER,SCISSOR;

    public RockPaperScissorHandSign getWinner() {

        if(this.equals(ROCK)) {
            return PAPER;
        }
        else if(this.equals(SCISSOR)){
            return ROCK;
        }
        else if (this.equals(PAPER)){
            return SCISSOR;
        }
        else return null;
    }

    public RockPaperScissorHandSign getLoser() {
        if(this.equals(ROCK)) {
            return SCISSOR;
        }
        else if(this.equals(SCISSOR)){
            return PAPER;
        }
        else if (this.equals(PAPER)){
            return ROCK;
        }
        else return null;
    }
}
