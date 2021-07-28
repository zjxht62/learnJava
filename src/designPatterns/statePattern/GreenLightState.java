package designPatterns.statePattern;

/**
 * 具体状态类
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public class GreenLightState extends Light implements State{

    private TrafficLight trafficLight;

    /**
     * 构造函数里传入环境（Context）类
     * @param trafficLight
     */
    public GreenLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    /**
     * 当前状态可以进行的操作
     */
    @Override
    public void timeUp() {
        //更改环境类（Context）的状态。
        this.trafficLight.setCurrentState(trafficLight.getYellowLightState());
    }

    @Override
    public void printCurrentLight() {
        System.out.println("绿灯亮");
    }
}
