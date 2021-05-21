package designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 老师，这里是一个主题
 *
 * @author trevor.zhao
 * @date 2021/5/21
 */
public class Teacher {
    private Boolean asking;
    private List<Observer> observerList;

    public Teacher() {
        this.asking = false;
        this.observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (-1 != index) {
            observerList.remove(observer);
        }
    }

    public void notifyObservers(){
        for (Observer o : observerList) {
            o.update();
        }
    }

    public void setAsking(Boolean asking) {
        this.asking = asking;
        notifyObservers();
    }
}
