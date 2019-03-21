package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR", "ROCK"),
    SCISSOR("ROCK", "PAPER");

    private String loosinSign;
    private String winningSign;

    private RockPaperScissorHandSign(String winningSign, String loosinSign) {
        this.winningSign = winningSign;
        this.loosinSign = loosinSign;

    }

    public RockPaperScissorHandSign getWinner() {

        return valueOf(this.winningSign);

//        if (this.equals(ROCK)) {
//            return PAPER;
//        } else if (this.equals(SCISSOR)) {
//            return ROCK;
//        } else if (this.equals(PAPER)) {
//            return SCISSOR;
//        } else return null;
    }

    public RockPaperScissorHandSign getLoser() {
        return valueOf(this.loosinSign);
//
//        if (this.equals(ROCK)) {
//            return SCISSOR;
//        } else if (this.equals(SCISSOR)) {
//            return PAPER;
//        } else if (this.equals(PAPER)) {
//            return ROCK;
//        } else return null;
    }
}
