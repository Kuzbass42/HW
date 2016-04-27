package javase01.t05.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int     colNum;
        int     rowNum;
        int     i;
        int     j;
        int     firstRowPosition;
        int     lastRowPosition;
        int[][] twoDim;

        if (args.length != 2) {
            System.out.println("Неверное число аргументов.");
        }
        else {
            try {
                rowNum = Integer.parseInt(args[0]);
                colNum = Integer.parseInt(args[1]);

                twoDim = new int[rowNum][colNum];

                for (i = 0; i < rowNum / 2; i++) {

                    firstRowPosition = calcFirstRowPosition(i, colNum);
                    lastRowPosition  = calcLastRowPosition(colNum - i - 1, colNum);

                    twoDim[i][firstRowPosition]                 = 1;
                    twoDim[i][lastRowPosition]                  = 1;

                    twoDim[rowNum - i - 1][firstRowPosition]    = 1;
                    twoDim[rowNum - i - 1][lastRowPosition]     = 1;
                }

                if (rowNum % 2 != 0){
                    twoDim[rowNum / 2][calcFirstRowPosition(rowNum / 2, colNum)]                = 1;

                    twoDim[rowNum / 2][calcLastRowPosition(colNum - rowNum / 2 - 1, colNum)]    = 1;
                }

                for (i = 0; i < rowNum; i++) {
                    for (j = 0; j < colNum; j++) {
                        System.out.print(twoDim[i][j] + "\t");
                    }
                    System.out.println();
                }

            } catch (NumberFormatException e) {
                System.err.println("Неверный формат аргумента.");
            }
        }
    }

    static int calcFirstRowPosition(int _firstRowPosition, int _colNum){

        while (_firstRowPosition >= _colNum){
            _firstRowPosition -= _colNum;
        }

        return _firstRowPosition;
    }

    static int calcLastRowPosition(int _lastRowPosition, int _colNum){
        while (_lastRowPosition < 0){
            _lastRowPosition += _colNum;
        }
        return _lastRowPosition;
    }
}