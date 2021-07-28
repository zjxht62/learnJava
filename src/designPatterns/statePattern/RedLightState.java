package designPatterns.statePattern;

/**
 * 具体状态类
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public class RedLightState extends Light implements State {

    private TrafficLight trafficLight;

    public RedLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void timeUp() {
        this.trafficLight.setCurrentState(trafficLight.getGreenLightState());
    }


    @Override
    public void printCurrentLight() {
        System.out.println("红灯亮");
    }
}
