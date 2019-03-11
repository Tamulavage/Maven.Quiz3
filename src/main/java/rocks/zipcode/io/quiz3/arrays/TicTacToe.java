package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] fullBoard = new String[2][2];

    public TicTacToe(String[][] board) {
        this.fullBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return this.fullBoard[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];


        column[0] = fullBoard[0][value];
        column[1] = fullBoard[1][value];
        column[2] = fullBoard[2][value];

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Boolean retVal = false;

        String[] currentRow = getRow(rowIndex);

        // should loop, but need more coffee
        if (currentRow[0].equals(currentRow[1])) {
            if (currentRow[0].equals(currentRow[2])) {
                retVal = true;
            }
        }

        return retVal;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Boolean retVal = false;

        String[] currentCol = getColumn(columnIndex);

        // should loop, but need more coffee
        if (currentCol[0].equals(currentCol[1])) {
            if (currentCol[0].equals(currentCol[2])) {
                retVal = true;
            }
        }

        return retVal;
    }

    public Boolean isDiagonalHomogeneous(Integer columnIndex) {
        Boolean retVal = false;

        // should loop, but need more coffee
        if (fullBoard[0][0].equals(fullBoard[1][1])) {
            if ((fullBoard[1][1].equals(fullBoard[2][2]))) {
                retVal = true;
            }
        } else if (fullBoard[2][0].equals(fullBoard[1][1])) {
            if ((fullBoard[1][1].equals(fullBoard[0][2]))) {
                retVal = true;
            }
        }

        return retVal;
    }

    public String getWinner() {
        String retVal = "";

        for (int i = 0; i < 3; i++) {
            // code smell
            if (isRowHomogenous(i)) {
                retVal = fullBoard[i][i];
            } else if (isColumnHomogeneous(i)) {
                retVal = fullBoard[i][i];

            } else if (isDiagonalHomogeneous(i)) {
                retVal = fullBoard[1][1];
            }

        }


        return retVal;
    }

    public String[][] getBoard() {
        return this.fullBoard;
    }
}
