package designPatterns.observerPattern;

public class BadStudent implements Observer {
    private Teacher teacher;
    private String action;

    public BadStudent(Teacher teacher) {
        this.teacher = teacher;
        this.action = "偷偷玩手机";
        teacher.registerObserver(this);
    }

    @Override
    public void update(Boolean asking) {
        System.out.printf("我是坏学生:");
        if (asking) {
            action = "躲躲闪闪，不要有眼神接触";
            System.out.println(action);
        } else {
            action = "接着玩手机";
            System.out.println(action);
        }


    }
}
