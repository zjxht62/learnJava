package designPatterns.statePattern;

/**
 * 测试类
 *
 * @author trevor.zhao
 * @date 2021/7/28
 */
public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0;i < 10;i++) {
            trafficLight.timeUp();
            System.out.println("等待60s");
            trafficLight.timeUp();
            trafficLight.timeUp();
            System.out.println("等待60s");
            
        }



    }

}
