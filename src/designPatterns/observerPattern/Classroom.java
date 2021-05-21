package designPatterns.observerPattern;

public class Classroom {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        GoodStudent goodStudent = new GoodStudent(teacher);
        BadStudent badStudent = new BadStudent(teacher);

        teacher.setAsking(true);
        teacher.setAsking(false);

    }
}
