package designPatterns.commandPattern;

/**
 * 具体的Command类，实现Command接口，包装一个真正执行动作的对象
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * Command的execute调用真正执行动作的对象的方法
     */
    @Override
    public void execute() {
        this.light.off();
    }
}
