package designPatterns.statePattern;

/**
 * 红绿灯，是环境类（Context）
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public class TrafficLight {
    //维护所有可能的状态以及当前状态
    private State currentState;
    private State redLightState;
    private State greenLightState;
    private State yellowLightState;

    public TrafficLight() {
        this.redLightState = new RedLightState(this);
        this.greenLightState = new GreenLightState(this);
        this.yellowLightState = new YelloLightState(this);
        this.currentState = redLightState;
    }

    //行为发生时委托给当前状态处理
    public void timeUp() {
        this.currentState.timeUp();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        Light light = (Light) currentState;
        light.printCurrentLight();
    }

    public State getRedLightState() {
        return redLightState;
    }

    public State getGreenLightState() {
        return greenLightState;
    }

    public State getYellowLightState() {
        return yellowLightState;
    }
}
