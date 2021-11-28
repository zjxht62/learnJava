package effectivejava.chapter2_create_destory;

import net.mindview.util.New;

public class User {
    private String name;
    private int age;
    private String sex;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    static class Builder {
        private String name;
        private int age;
        private String sex;

        Builder(String name) {
            this.name = name;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        User getResult() {
            return new User(this);
        }




    }

    public static void main(String[] args) {

//        Builder builder = new User.Builder();
//        builder.setAge(11);
//        System.out.println(builder.getResult());
//
//        builder.setName("小明");
//        System.out.println(builder.getResult());
//
//        System.out.println(builder.setName("小二").setAge(12).getResult());





    }

}
