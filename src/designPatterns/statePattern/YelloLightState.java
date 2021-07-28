package designPatterns.statePattern;

/**
 * 具体状态类
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public class YelloLightState extends Light implements State {

    private TrafficLight trafficLight;

    public YelloLightState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void timeUp() {
        this.trafficLight.setCurrentState(trafficLight.getRedLightState());
    }

    @Override
    public void printCurrentLight() {
        System.out.println("黄灯闪两下");
    }
}
