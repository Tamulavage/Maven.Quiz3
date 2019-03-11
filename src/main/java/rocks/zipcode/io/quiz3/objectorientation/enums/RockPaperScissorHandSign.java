package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign retVal = null;
        switch (this) {
            case ROCK:
                retVal = PAPER;
                break;
            case PAPER:
                retVal = SCISSOR;
                break;
            case SCISSOR:
                retVal = ROCK;
                break;

        }
        return retVal;
    }

    public RockPaperScissorHandSign getLoser() {

        RockPaperScissorHandSign retVal = null;
        switch (this) {
            case ROCK:
                retVal = SCISSOR;
                break;
            case PAPER:
                retVal = ROCK;
                break;
            case SCISSOR:
                retVal = PAPER;
                break;

        }
        return retVal;
    }

}
