package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isHomogenous(getRow(rowIndex));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isHomogenous(getColumn(columnIndex));
    }

    private Boolean isHomogenous(String[] rowOrColumn) {
        return rowOrColumn[0].equals(rowOrColumn[1]) && rowOrColumn[1].equals(rowOrColumn[2]);
    }


    public String getWinner() {
        return checkEachColumn() != null ? checkEachColumn() : checkEachRow() != null ? checkEachRow() : board[1][1];
    }

    private String checkEachColumn() {
        for (int i = 0; i < 3; i++) {
            if(isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }
        return null;
    }

    private String checkEachRow() {
        for (int i = 0; i < 3; i++) {
            if(isRowHomogenous(i)) {
                return board[i][0];
            }
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
