package OO.chapter3.eightQueen;

import java.awt.*;
import java.util.Stack;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/9
 */
public class EightQueen {
    public static final int NUM = 8;
    private Chessboard chessboard;
    private ChessPiece chessPiece[];

    public EightQueen() {
        chessboard = new Chessboard(NUM, NUM);
        chessPiece = new ChessPiece[NUM];
        for (int i = 0; i < NUM; i++) {
            chessPiece[i] = new ChessPiece(i + 1);
        }
    }

    public ChessPiece getAt(int i) {
        if (i < 0 || i >= NUM) {
            return null;
        } else {
            return chessPiece[i];
        }
    }

    public void play() {
        Stack<ChessPiece> stack;
        int i, j, k, x, y;
        stack = new Stack<ChessPiece>();

        chessboard.putChessPiece(0, 0, chessPiece[0]);
        chessPiece[0].setPoint(new Point(0, 0));
        stack.push(chessPiece[0]);

        i = 1;
        j = 0;

        while (i < NUM) {
            for (k = 0; k < i; k++) {
                x = (int)chessPiece[k].getPoint().getX();
                y = (int)chessPiece[k].getPoint().getY();
                if ((j == y) || (Math.abs(x - i) == Math.abs(y - j))) {
                    break;
                }
            }
            if (k == i) {
                chessboard.putChessPiece(i, j, chessPiece[i]);
                chessPiece[i].setPoint(new Point(i, j));
                stack.push(chessPiece[i]);
                i++;
                j = 0;
            } else {
                if (j < NUM - 1) {
                    j++;
                } else {
                    while (! stack.empty()) {
                        ChessPiece c = stack.pop();
                        i = (int)c.getPoint().getX();
                        j = (int)c.getPoint().getY();
                        chessboard.moveChessPiece(i, j);
                        if (j < NUM - 1) {
                            j++;
                            break;
                        }
                    }
                }
            }
        }

    }

    public String result() {
        return chessboard.toString();
    }

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.play();
        System.out.println(eightQueen.result());
    }

}
