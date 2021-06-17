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

    //注册观察者
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    //取消注册观察者
    public void unregisterObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (-1 != index) {
            observerList.remove(observer);
        }
    }
    //通知观察者
    public void notifyObservers(){
        for (Observer o : observerList) {
            o.update(asking);
        }
    }
    //修改状态触发通知
    public void setAsking(Boolean asking) {
        this.asking = asking;
        notifyObservers();
    }
}
