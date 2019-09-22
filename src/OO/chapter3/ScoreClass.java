package OO.chapter3;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/4
 */
public class ScoreClass {
    /**
     * 学号
     */
    private int No;

    /**
     * 成绩
     */
    private int score;

    public ScoreClass() {
        this.No = 1000;
        this.score = 0;
    }

    public ScoreClass(int n, int s) {
        this.No = n;
        this.score = s;
    }

    public void setInfo(int n, int s) {
        this.No = n;
        this.score = s;
    }

    public int getNo() {
        return this.No;
    }

    public int getScore() {
        return this.score;
    }


}
