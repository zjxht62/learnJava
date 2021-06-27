package designPatterns.commandPattern;

/**
 * 灯，实际需要执行操作的对象，receiver
 */
public class Light {
    public void on() {
        System.out.println("the light is on");
    }

    public void off() {
        System.out.println("the light is off");
    }
}
