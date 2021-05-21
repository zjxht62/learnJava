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
        if (asking) {
            action = "装作看远方的风景，心想千万别问我";
            System.out.println(action);
        } else {
            action = "接着玩手机";
            System.out.println(action);
        }


    }
}
