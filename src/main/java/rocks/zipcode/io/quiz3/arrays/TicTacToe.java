package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] arrBoard;
    //[rows][columns]

    public TicTacToe(String[][] board) {
        arrBoard = board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {
        String [] rowArr = new String[arrBoard.length];
        for (int col = 0; col < arrBoard.length ; col++) {
            rowArr[col] = arrBoard[value][col];
        }
        return rowArr;
    }

    public String[] getColumn(Integer value) {
        String [] colArr = new String[arrBoard.length];
        for (int row = 0; row < arrBoard.length ; row++) {
            colArr[row] = arrBoard[row][value];
        }
        return colArr;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Boolean flag = false;
        for (int col = 0; col < arrBoard.length ; col++) {
            if (arrBoard[rowIndex][0] == arrBoard[rowIndex][1] &&
                    arrBoard[rowIndex][0] == arrBoard[rowIndex][2])
                flag = true;

            else
                flag = false;

        }
       return flag;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Boolean flag = false;
        for (int col = 0; col < arrBoard.length ; col++) {
            if (arrBoard[0][columnIndex] == arrBoard[1][columnIndex] &&
                    arrBoard[0][columnIndex] == arrBoard[2][columnIndex])
                flag = true;

            else
                flag = false;

        }
        return flag;
    }


    public Boolean isDiagonalHomogeneous(Integer columnIndex) {
        Boolean flag = false;
        for (int col = 0; col < arrBoard.length ; col++) {
            if((arrBoard[0][columnIndex] == arrBoard[1][1] &&
                    arrBoard[0][columnIndex] == arrBoard[2][2]) ||
              (arrBoard[0][columnIndex] == arrBoard[1][1] &&
                    arrBoard[0][columnIndex] == arrBoard[2][0]))
                flag = true;

            else
                flag = false;

        }
        return flag;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i <arrBoard.length ; i++) {
            if(isColumnHomogeneous(1))
            {
                winner = arrBoard[0][1];
            }
            else if(isColumnHomogeneous(2)){
                winner = arrBoard[0][2];
            }
            else if(isColumnHomogeneous(0)){
                winner = arrBoard[0][0];
            }
            else if(isRowHomogenous(0)){
                winner = arrBoard[0][0];
            }
            else if(isRowHomogenous(1)){
                winner = arrBoard[1][0];
            }
            else if(isRowHomogenous(2)){
                winner = arrBoard[2][0];
            }
            else if(isDiagonalHomogeneous(0)){
                winner = arrBoard[0][0];
            }
            else if(isDiagonalHomogeneous(2)){
                winner = arrBoard[2][0];
            }
        }

        return winner;
    }

    public String[][] getBoard() {
        return arrBoard;
    }
}
