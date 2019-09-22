package OO.chapter4.exp4_3;

import java.time.Year;
import java.util.Date;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/1/15
 */
public class PersonClass {
    private int No;
    private String name;
    private boolean sex;
    private Date birthday;

    public PersonClass() {

    }

    public PersonClass(int No, String name, boolean sex, int year, int month, int day) {
        this.No = No;
        this.name = new String(name);
        this.sex = sex;
        this.birthday = new Date(year, month - 1, day);
    }

    public void setNo(int no) {
        No = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = new Date(year, month - 1, day);
    }

    public int getNo() {
        return No;
    }

    public String getName() {
        return name;
    }

    public boolean getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (null == otherObject) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        PersonClass other = (PersonClass)otherObject;
        if (No == other.No) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nNo:" + No + "\nName:" + name + "\nSex:" + sex + "\nBirthday" + String.format("%tF", birthday);
    }
}
