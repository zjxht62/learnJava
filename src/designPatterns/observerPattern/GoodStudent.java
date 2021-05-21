package designPatterns.observerPattern;

public class GoodStudent implements Observer {
    private Teacher teacher;
    private String action;

    public GoodStudent(Teacher teacher) {
        this.teacher = teacher;
        this.action = "好好听讲";
        teacher.registerObserver(this);
    }

    @Override
    public void update(Boolean asking) {
        if (asking) {
            action = "老师提问了，准备举手回答";
            System.out.println(action);
        } else {
            action = "好好听讲";
            System.out.println(action);
        }


    }
}
