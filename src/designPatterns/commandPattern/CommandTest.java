package designPatterns.commandPattern;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        Invoker invoker = new Invoker(lightOnCommand);
        invoker.call();
    }
}
