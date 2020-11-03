package thinkinjava.chapter19_enumerated.menu;

import net.mindview.util.Enums;

/**
 * 枚举的枚举
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */
public enum Course {
    APPETIZER(Appetizer.class),
    MAINCOURSE(MainCourse.class),
    DESSERT(Dessert.class),
    COFFEE(Coffee.class);


    private Food[] values;

    Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
    public Food randomSelection() {
        return Enums.random(values);
    }
}
