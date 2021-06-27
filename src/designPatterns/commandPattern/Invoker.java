package designPatterns.commandPattern;

/**
 * 调用命令的类，包含command对象，可以动态更改
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        this.command.execute();
    }
}
