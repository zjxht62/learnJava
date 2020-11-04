package thinkinjava.chapter19_enumerated;

/**
 * 使用enum分发的石头剪刀布
 *
 * @author trevor.zhao
 * @date 2020/11/4
 */
public enum RoShamBo2 implements Competitor<RoShamBo2>{
    PAPER(Outcome.DRAW, Outcome.LOSE, Outcome.WIN),
    SCISSORS(Outcome.WIN, Outcome.DRAW, Outcome.LOSE),
    ROCK(Outcome.LOSE, Outcome.WIN, Outcome.DRAW);

    private Outcome vPAPER, vSCISSORS, vROCK;

    RoShamBo2(Outcome vPAPER, Outcome vSCISSORS, Outcome vROCK) {
        this.vPAPER = vPAPER;
        this.vSCISSORS = vSCISSORS;
        this.vROCK = vROCK;
    }

    //第一次多路分发,通过接口调用来确定第一个参数的类型,就像下面的例子,首先是一个Paper,接下来在paper里switch入参Scissors,返回Lose
    @Override
    public Outcome compete(RoShamBo2 it) {
        switch (it) {
            default:
            case PAPER:return vPAPER;
            case SCISSORS:return vSCISSORS;
            case ROCK:return vROCK;
        }
    }

    public static void main(String[] args) {
        System.out.println(PAPER.compete(SCISSORS));
    }


}
