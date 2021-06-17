package designPatterns.observerPattern;

public class Classroom {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        GoodStudent goodStudent = new GoodStudent(teacher);
        BadStudent badStudent = new BadStudent(teacher);

        teacher.setAsking(true);
        teacher.setAsking(false);

        //老师不管哪个坏学生了，爱听不听，我也不问你了
        teacher.unregisterObserver(badStudent);
        teacher.setAsking(true);

    }
}
