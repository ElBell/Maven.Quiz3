package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    private RockPaperScissorHandSign winner;
    private RockPaperScissorHandSign loser;

    static {
        ROCK.winner = PAPER;
        ROCK.loser = SCISSOR;
        PAPER.winner = SCISSOR;
        PAPER.loser = ROCK;
        SCISSOR.winner = ROCK;
        SCISSOR.loser = PAPER;
    }

    public RockPaperScissorHandSign getWinner() {
        return this.winner;
    }

    public RockPaperScissorHandSign getLoser() {
        return this.loser;
    }
}
