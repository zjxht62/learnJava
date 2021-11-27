package designPatterns.statePattern;

/**
 * 状态接口
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public interface State {
    //状态下可进行的操作，可以多个
    void timeUp();
}
