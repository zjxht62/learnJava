package OO.chapter3.eightQueen;

import sun.text.resources.sl.CollationData_sl;

import java.awt.*;
import java.util.Arrays;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/9
 */
public class Chessboard {
    private int rows;
    private int cols;
    private ChessPiece chessboard[][];

    public Chessboard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        chessboard = new ChessPiece[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                chessboard[i][j] = null;
            }
        }
    }

    public boolean IsEmpty(int x, int y) {
        if (chessboard[x][y] == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty(Point point) {
        if (chessboard[(int)point.getX()][(int)point.getY()] == null) {
            return true;
        } else {
            return false;
        }
    }

    public void putChessPiece(int row, int col, ChessPiece chessPiece) {
        if (chessPiece == null) {
            return;
        }
        chessboard[row][col] = chessPiece;
    }

    public ChessPiece moveChessPiece(int row, int col) {
        ChessPiece chessPiece = chessboard[row][col];
        chessboard[row][col] = null;
        return chessPiece;
    }

    public ChessPiece getChessPiece(int row, int col) {
        return chessboard[row][col];
    }

    public void setRowCol(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String str;
        str = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (IsEmpty(i, j)) {
                    str += "-";
                } else {
                    str += "@";
                }
            }
            str += "\n";
        }
        return str;
    }
}
