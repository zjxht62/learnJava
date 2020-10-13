package thinkinjava.chapter10_innerclasses.controller;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/8/3
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
