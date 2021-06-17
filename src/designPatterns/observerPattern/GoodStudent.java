package designPatterns.observerPattern;

/**
 * 好学生，是一个观察者
 */
public class GoodStudent implements Observer {
    private Teacher teacher;
    private String action;

    //构造的时候传入主题，注册为观察者
    public GoodStudent(Teacher teacher) {
        this.teacher = teacher;
        this.action = "好好听讲";
        teacher.registerObserver(this);
    }

    //被主题通知的时候调用
    @Override
    public void update(Boolean asking) {
        System.out.printf("我是好学生:");
        if (asking) {
            action = "老师提问了，准备举手回答";
            System.out.println(action);
        } else {
            action = "好好听讲";
            System.out.println(action);
        }


    }
}
